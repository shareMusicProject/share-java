package com.backend.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Pandora Boot应用的入口类
 * <p>
 * 详情见http://gitlab.alibaba-inc.com/middleware-container/pandora-boot/wikis/spring-boot-diamond
 *
 * @author chengxu
 */
@RestController
@EnableSwagger2
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Application {

    @RequestMapping("/hello")
    String index(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
