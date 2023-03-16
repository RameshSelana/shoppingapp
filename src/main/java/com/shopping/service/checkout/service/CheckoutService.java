package com.shopping.service.checkout.service;

import java.util.List;
import java.util.Optional;

import com.shopping.service.checkout.dto.Cart;

public interface CheckoutService{
	
	public Optional<Cart> doCheckoutItems(List<String> items);

	public Optional<Cart> doCheckoutItemsWithDiscount(List<String> items);
}
