package com.shopping.service.checkout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shopping.service.checkout.service.CheckoutService;

@SpringBootApplication
public class ShoppingApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
