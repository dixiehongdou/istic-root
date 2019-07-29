package com.istic.feign;

import com.istic.constants.FormNoTypeEnum;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by hch on 2018/12/6.
 */
@FeignClient("app-server")
public interface AppServer {
    @PostMapping("/api/formNoGenerate")
    String formNoGenerate(@RequestBody FormNoTypeEnum formNoTypeEnum);
}
