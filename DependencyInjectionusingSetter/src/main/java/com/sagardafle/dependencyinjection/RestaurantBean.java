package com.sagardafle.dependencyinjection;

public class RestaurantBean {
	
 IHotDrink hotDrink;
 
 public void setHotDrink(IHotDrink hotDrink) {
	this.hotDrink =hotDrink;
}
 
 public void prepareHotDrink(){
	 hotDrink.prepareHotDrink();
 }
}
