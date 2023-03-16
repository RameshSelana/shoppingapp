package com.shopping.service.checkout.exception;

import lombok.Data;

@Data
public class ItemOutOfStockException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errorCode;

	public ItemOutOfStockException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

}
