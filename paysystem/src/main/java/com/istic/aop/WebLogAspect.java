package com.istic.aop;


import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;


@Aspect
@Component
@Slf4j
public class WebLogAspect {
    static ThreadLocal<LinkedHashMap<Object, Object>> map = ThreadLocal.withInitial(LinkedHashMap::new);

    @Pointcut("execution(public * com.istic.controller.*.*(..))")
    public void webLog() {

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        HttpServletRequest request = sra.getRequest();
        ApiOperation annotation = targetMethod.getAnnotation(ApiOperation.class);
        String value = annotation.value();
        String method = joinPoint.getSignature().getName();

        //获取参数
        Map<String, String[]> parameterMap = request.getParameterMap();
        map.get().put("requestParam", JSON.toJSON(parameterMap));
        WebLogAspect.map.get().put("requestBody", JSON.toJSON(joinPoint.getArgs()));
        map.get().put("clientIp", request.getRemoteAddr());
        map.get().put("server", request.getLocalAddr());
        map.get().put("serverPort", request.getServerPort());
        map.get().put("requestMethod", request.getMethod().toUpperCase());
        map.get().put("method", method);
        map.get().put("apiName", value);
    }

    @AfterReturning(returning = "result", pointcut = "webLog()")
    public void doAfterReturning(Object result) throws Throwable {
        map.get().put("response", result);
        log.info(JSON.toJSONString(map.get()));
    }


}
