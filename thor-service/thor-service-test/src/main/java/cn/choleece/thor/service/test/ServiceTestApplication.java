package cn.choleece.thor.service.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @description: TODO
 * @author: choleece
 * @time: 2019-12-18 14:30
 */
@SpringBootApplication
@RefreshScope
public class ServiceTestApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTestApplication.class, args);
    }
}
