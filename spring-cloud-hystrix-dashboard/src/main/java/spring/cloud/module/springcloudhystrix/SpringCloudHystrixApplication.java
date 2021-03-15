package spring.cloud.module.springcloudhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 监控单体应用
 * Hystrix仪表盘,主要用来监控Hystrix的实时运行状态
 */
@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudHystrixApplication.class, args);
    }

}
