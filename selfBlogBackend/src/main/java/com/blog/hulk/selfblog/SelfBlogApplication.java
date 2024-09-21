package com.blog.hulk.selfblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SelfBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfBlogApplication.class, args);
    }
    // 控制器
    @RestController
    public class HelloWorldController {
        @GetMapping("/hello")
        public String hello() {
            return "Hello, SpringBoot!";
        }
    }

}
