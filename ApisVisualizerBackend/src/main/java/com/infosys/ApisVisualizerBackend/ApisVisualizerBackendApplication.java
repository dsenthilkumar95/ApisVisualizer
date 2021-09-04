package com.infosys.ApisVisualizerBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.infosys.*")
@EnableJpaRepositories(basePackages = "com.infosys.repository")
@EntityScan("com.infosys.pojo")
@SpringBootApplication
public class ApisVisualizerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApisVisualizerBackendApplication.class, args);
	}

}
