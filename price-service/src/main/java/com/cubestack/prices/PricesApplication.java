package com.cubestack.prices;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class PricesApplication {

	@RequestMapping(value = "/get-prices")
	public Map<String, String> getAllPrices() {
		Map<String, String> prices = new HashMap<>();
		prices.put("Game of Thrones", "Rs. 750.00");
		prices.put("Harry Porter", "Rs. 520.00");
		return prices;
	}
	
	@RequestMapping(value = "/get-prices/{bookId}")
	public String getBookPrice(@PathVariable("bookId") int bookId) {
		switch (bookId) {
			case 100: return "Rs. 750.00";
			case 101: return "Rs. 520.00";	
			default: return "Not found";
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(PricesApplication.class, args);
	}

}
