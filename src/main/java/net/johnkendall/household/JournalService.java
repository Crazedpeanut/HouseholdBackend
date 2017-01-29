package net.johnkendall.household;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by john on 29/01/2017.
 */
@SpringBootApplication
@EnableEurekaClient
public class JournalService {
    public static void main(String[] args)
    {
        SpringApplication.run(JournalService.class, args);
    }
}
