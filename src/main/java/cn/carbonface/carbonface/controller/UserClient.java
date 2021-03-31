package cn.carbonface.carbonface.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("carbon-user")
public interface UserClient {

    @GetMapping("user/hello")
    String test();
}
