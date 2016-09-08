package com.sagardafle.dependencyinjection;

public class RestaurantBean {
	
 IHotDrink hotdrink;
 
 public RestaurantBean(IHotDrink hotDrink) {
	this.hotdrink =hotDrink; 
}
 
 public void prepareHotDrink(){
	 hotdrink.prepareHotDrink();
 }
}
