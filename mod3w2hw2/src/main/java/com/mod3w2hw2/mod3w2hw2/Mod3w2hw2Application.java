package com.mod3w2hw2.mod3w2hw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Mod3w2hw2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mod3w2hw2Application.class, args);

		String url = "https://my.api.mockaroo.com/movie.json?key=bb299fd0";
		// making API calls
		RestTemplate restTemplate = new RestTemplate();

		String response = null;

		response = restTemplate.getForObject(url, String.class);

		System.out.println(response);

	}

}
