package ru.snack.java.eurecaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurecaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurecaClient2Application.class, args);
	}

}
