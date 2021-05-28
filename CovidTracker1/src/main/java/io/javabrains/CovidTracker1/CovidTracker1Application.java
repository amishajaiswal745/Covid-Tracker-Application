package io.javabrains.CovidTracker1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidTracker1Application {

	public static void main(String[] args) {

		SpringApplication.run(CovidTracker1Application.class, args);
	}

}
