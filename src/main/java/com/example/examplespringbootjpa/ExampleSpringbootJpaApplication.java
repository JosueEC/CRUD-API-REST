package com.example.examplespringbootjpa;

import com.example.examplespringbootjpa.model.Client;
import com.example.examplespringbootjpa.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;

@SpringBootApplication
public class ExampleSpringbootJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringbootJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
		return args -> {
			Client client1 = new Client(
					null,
					"Josue",
					true,
					new Timestamp(System.currentTimeMillis()),
					"1234",
					"josue@gmail.com"
			);

			clientRepository.save(client1);
		};
	}

}
