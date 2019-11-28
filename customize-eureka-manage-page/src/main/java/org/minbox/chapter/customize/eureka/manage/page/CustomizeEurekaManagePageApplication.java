package org.minbox.chapter.customize.eureka.manage.page;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 自定义Eureka Server管理界面
 *
 * @author 恒宇少年
 */
@SpringBootApplication
@EnableEurekaServer
public class CustomizeEurekaManagePageApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomizeEurekaManagePageApplication.class, args);
    }

}
