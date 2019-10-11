package org.minbox.chapter.seata;

import org.minbox.chapter.seata.common.DataSourceProxyAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

/**
 * @author 恒宇少年
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "org.minbox.chapter.seata.openfeign")
@Import(DataSourceProxyAutoConfiguration.class)
public class OrderServiceApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(OrderServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
        logger.info("订单服务启动成功.");
    }
}
