package br.com.facebookcopy.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.facebookcopy.entity")
@ComponentScan(basePackages = {"br.com.facebookcopy.controller", "br.com.facebookcopy.service", "br.com.facebookcopy.config"})
@EnableJpaRepositories("br.com.facebookcopy.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
