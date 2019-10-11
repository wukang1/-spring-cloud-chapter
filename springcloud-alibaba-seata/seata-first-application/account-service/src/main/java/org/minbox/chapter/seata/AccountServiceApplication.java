package org.minbox.chapter.seata;

import org.minbox.chapter.seata.common.DataSourceProxyAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author 恒宇少年
 */
@SpringBootApplication
@Import(DataSourceProxyAutoConfiguration.class)
public class AccountServiceApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(AccountServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
        logger.info("账户服务启动成功.");
    }
}
