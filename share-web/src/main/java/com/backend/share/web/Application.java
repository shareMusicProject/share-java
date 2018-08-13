package com.backend.share.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Pandora Boot应用的入口类
 * <p>
 * 详情见http://gitlab.alibaba-inc.com/middleware-container/pandora-boot/wikis/spring-boot-diamond
 *
 * @author chengxu
 */
//@MapperScan("com.aliyun.sop.cupid.mybatis.mapper")
//@SpringBootApplication(scanBasePackages = {"com.backend.share"})
//@ImportResource({ "classpath:applicationContext.xml" })
//@EnableTransactionManagement
//@ServletComponentScan
@RestController
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
