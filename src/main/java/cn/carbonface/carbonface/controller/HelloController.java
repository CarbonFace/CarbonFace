package cn.carbonface.carbonface.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classname: HelloController
 * Description: hello controller for carbonface
 * @author CarbonFace <553127022@qq.com>
 * Date: 2021/3/26 14:01
 * @version V1.0
 */

@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public String hello(){
        log.info("hello!");
        return "hello";
    }

}
