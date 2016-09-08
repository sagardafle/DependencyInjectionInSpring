package com.sagardafle.dependencyinjection;

public class Tea implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("Preparing Hot Tea!");
	}

}
