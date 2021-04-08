package cn.carbonface.carbonface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("cn.carbonface")//it's vital to get other module's spring bean
@EnableFeignClients("cn.carbonface")
@EnableConfigurationProperties
@EnableOpenApi
public class CarbonfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarbonfaceApplication.class, args);
    }

}
