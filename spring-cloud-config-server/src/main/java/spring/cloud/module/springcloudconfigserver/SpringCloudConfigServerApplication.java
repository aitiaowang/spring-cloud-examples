package spring.cloud.module.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心
 *Spring Cloud Config为分布式系统中的外部配置提供服务器和客户端支持
 */
@SpringBootApplication
//开启配置中心服务端功能
@EnableConfigServer
public class SpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApplication.class, args);
    }

}
