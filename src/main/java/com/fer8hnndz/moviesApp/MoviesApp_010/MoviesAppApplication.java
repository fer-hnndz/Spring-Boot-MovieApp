package com.fer8hnndz.moviesApp.MoviesApp_010;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fer8hnndz.moviesApp.MoviesApp_010.model.Customer;
import com.fer8hnndz.moviesApp.MoviesApp_010.repository.CustomerRepository;

@SpringBootApplication
@RestController
public class MoviesAppApplication {

	private static final Logger log = LoggerFactory.getLogger(MoviesAppApplication.class);
	private final CustomerRepository customerRepository;

	public MoviesAppApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(MoviesAppApplication.class, args);
	}

	@GetMapping("/")
	public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello, %s!", name);
	}

	@GetMapping("/customers")
	public List<Customer> getCustomer() {
		log.info("Fetching customer data");

		return customerRepository.findAll();
	}

}
