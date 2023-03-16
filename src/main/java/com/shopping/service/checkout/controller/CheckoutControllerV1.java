package com.shopping.service.checkout.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.service.checkout.dto.Cart;
import com.shopping.service.checkout.service.CheckoutService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@Api(tags = "Checkout Item")
@RestController
@RequestMapping("/v1/checkout")
@RequiredArgsConstructor
public class CheckoutControllerV1 {

	@Autowired
	private CheckoutService checkoutService;

	@ApiOperation(value = "Checkout list of selected items")
	@PostMapping
	public ResponseEntity<Cart> doCheckoutItem(@RequestBody final List<String> items) {

		Optional<Cart> cart = checkoutService.doCheckoutItems(items);

		return new ResponseEntity<>(cart.get(), HttpStatus.OK);
	}
}
