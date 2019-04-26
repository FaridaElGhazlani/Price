package com.decathlon.Price;

import java.util.HashMap;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PriceService {

//	private HashMap<Long, Integer> mapPrice = new HashMap<>();

	public PriceService() {
	}

	public int getPrice(String id) {

			int max = 70;
			int min = 30;
			Random r = new Random();
			int t = r.nextInt((max - min) + 1) + min;
			return t;
	}

}
