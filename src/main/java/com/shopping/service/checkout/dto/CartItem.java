package com.shopping.service.checkout.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CartItem {

	private String item;

	private double price;
	
	private double discountPercent;
	
	private double discountedPrice;
	
}
