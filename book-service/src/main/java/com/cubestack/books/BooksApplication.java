package com.cubestack.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BooksApplication {
	
	@RequestMapping(value = "/available")
	  public String available() {
	    return "Hell, yes!";
	  }

	  @RequestMapping(value = "/checked-out")
	  public String checkedOut() {
	    return "Your favourite book is checked out!";
	  }
	  
	  @RequestMapping(value = "/add-to-cart", method = RequestMethod.POST)
	  public String addToCart(@RequestBody Book book) {
	    return book + " added to cart";
	  }


	public static void main(String[] args) {
		SpringApplication.run(BooksApplication.class, args);
	}
	
}
