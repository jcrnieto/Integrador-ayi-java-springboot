package com.ayi.integrador.rest.serv.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EntityScan(basePackages = { "com.ayi.integrador.rest.serv.app.entity"})
@EnableJpaRepositories( basePackages = {"com.ayi.integrador.rest.serv.app.repository"})

@SpringBootApplication
public class IntegradorAyiSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegradorAyiSpringbootApplication.class, args);
	}

}
