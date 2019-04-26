package com.decathlon.Price;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Cacheable("price")
@RestController
@RequestMapping("/price/")
public class PriceController {
	
	@Autowired
	PriceService priceService; // = new PriceService();
	
	@GetMapping("{id}")
	public int getPrice(@PathVariable String id){

		return priceService.getPrice(id);
	}

}
