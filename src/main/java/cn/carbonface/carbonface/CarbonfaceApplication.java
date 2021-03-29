package cn.carbonface.carbonface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableDiscoveryClient
@EnableOpenApi
@ComponentScan("cn.carbonface")//it's vital to get other module's spring bean
public class CarbonfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarbonfaceApplication.class, args);
    }

}
