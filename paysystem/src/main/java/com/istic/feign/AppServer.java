package com.istic.feign;

import com.istic.constants.FormNoTypeEnum;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 9:47
 */
@FeignClient("app-server")
public interface AppServer {
    @PostMapping("/api/formNoGenerate")
    String formNoGenerate(@RequestBody FormNoTypeEnum formNoTypeEnum);
}
