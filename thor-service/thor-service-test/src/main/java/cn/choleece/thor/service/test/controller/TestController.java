package cn.choleece.thor.service.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: TODO
 * @author: choleece
 * @time: 2019-12-18 14:27
 */
@RestController
public class TestController {

    @Value("${user.name}")
    private String userName;

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/user/name")
    public String getUserName() {
        System.out.println("get user name...");
        return userName;
    }
}
