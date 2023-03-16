package com.shopping.service.checkout.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ITEM_CATALOG")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {

	@Id
	@Column(name = "ITEM_NAME")
	private String itemName;

	@Column(name = "ITEM_PRICE")
	private double price;

	@Column(name = "ITEM_DISCOUNT")
	private double discount;
}
