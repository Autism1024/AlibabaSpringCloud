package cloud.common.cloudcommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudCommonApplication.class, args);
	}

}
