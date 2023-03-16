package com.shopping.service.checkout.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.service.checkout.dto.Cart;
import com.shopping.service.checkout.dto.CartItem;
import com.shopping.service.checkout.entity.Item;
import com.shopping.service.checkout.repository.CheckoutRepository;
import com.shopping.service.checkout.service.CheckoutService;

@Service
public class CheckoutServiceImpl implements CheckoutService {

	@Autowired
	private CheckoutRepository chekoutRepo;

	@Override
	public Optional<Cart> doCheckoutItems(List<String> items) {

		// Create Cart with Items
		Cart cart =createCart(items);
		return Optional.ofNullable(cart);
	}

	private Cart createCart(List<String> items) {
		Cart cart = Cart.builder().cartItems(new ArrayList<CartItem>()).build();
		items.stream().forEach(item -> {
			CartItem cartItem = CartItem.builder().item(item).build();
			Optional<Item> itemEntity= this.chekoutRepo.getItemByItemName(item.toUpperCase());
			cartItem.setPrice(itemEntity.get().getPrice());
			cart.setTotalPrice(cart.getTotalPrice()+itemEntity.get().getPrice());
			cart.getCartItems().add(cartItem);
		});
		cart.setTotalItems(cart.getCartItems().size());
		return cart;

	}

}
