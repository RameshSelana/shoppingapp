package com.shopping.service.checkout.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cart {

	private int totalItems;
	
	private double totalPrice;
	
	private double totalDiscount;

	private List<CartItem> cartItems;

}
