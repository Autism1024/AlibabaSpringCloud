package cloud.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 依登
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProductApplication.class, args);
    }

}
