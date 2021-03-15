package spring.cloud.module.springcloudturbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Turbine集群监控
 * Turbine有一个重要的功能就是汇聚监控信息，并将汇聚到的监控信息提供给Hystrix Dashboard来集中展示和监控
 */
@EnableTurbine
//@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTurbineApplication.class, args);
    }

}
