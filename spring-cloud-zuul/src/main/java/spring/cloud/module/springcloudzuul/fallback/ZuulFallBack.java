package spring.cloud.module.springcloudzuul.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.client.ClientHttpResponse;

/**
 * @Description: zull的服务降级
 * @Author: sxk
 * @CreateDate: 2021/3/17 22:41
 * @Version: 1.0
 */
public class ZuulFallBack implements ZuulFallbackProvider {

    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        return null;
    }
}
