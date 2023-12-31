package au.com.vincentbai.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaConfigNacosClient3377 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConfigNacosClient3377.class, args);
    }

}
