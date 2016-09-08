package com.sagardafle.dependencyinjection;

public class Coffee implements IHotDrink {

	@Override
	public void prepareHotDrink() {
		System.out.println("Preparing Hot Coffee!");
	}

}
