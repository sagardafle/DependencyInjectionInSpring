package com.sagardafle.dependencyinjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DependencyInjectionusingSetterApplication {

	private static ApplicationContext myapplicationcontext;

	public static void main(String[] args) {
		myapplicationcontext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		RestaurantBean restobj = (RestaurantBean) myapplicationcontext.getBean("restaurantBean");
		restobj.prepareHotDrink();
	}
}
