package com.CakeWalk.Cart;

import java.util.ArrayList;
import java.util.List;

import lombok.ToString;

@ToString
public class cart {

	
	 private List<itemCart> list = new ArrayList<>();

	    public cart() {
	        this.list = new ArrayList<>();
	    }

	    public void addItem(itemCart item) {
	    	list.add(item);
	    }

	    public List<itemCart> getItems() {
	        return list;
	    }
	    
	    public void deleteItem(itemCart item) {
	    	list.remove(item);
	    }
	    
}
