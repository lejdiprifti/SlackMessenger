package com.transit.demo;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({"com.transit"})
@EntityScan(basePackages = "com.transit")
@EnableJpaRepositories("com.transit.repository")
public class TransitApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransitApplication.class, args);
	}

	

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
}
