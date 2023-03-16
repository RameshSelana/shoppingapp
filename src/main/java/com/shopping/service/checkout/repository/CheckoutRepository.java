package com.shopping.service.checkout.repository;

import java.util.Optional;

import com.shopping.service.checkout.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckoutRepository extends JpaRepository<Item,String>
{
	
	public Optional<Item> getItemByItemName(String itemName);

}
