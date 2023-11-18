package com.CakeWalk.Cart;

import java.math.BigDecimal;


import com.CakeWalk.Entity.Cakes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class itemCart {

	int id;
	String image;
	String name;
	BigDecimal price;
	int qty = 1;
	
	private Cakes cakes;
	
}
