package com.java.staticBlock;

class Mobile{
	
	String brand;
	int price;
	static String name;
	
	public void show() {
		System.out.println(brand + " " +price+ " " +name);	
	}
	
}

public class DemoMobile {

	public static void main(String[] args) {

		Mobile first = new Mobile();
		first.brand = "Apple";
		first.price = 2000;
		Mobile.name = "IPhone 15 Pro";	//static variables can be called by classname 
		
		Mobile second = new Mobile();
		second.brand = "Google";
		second.price = 1800;
		Mobile.name = "Google Pixel 9";
		
		Mobile.name = "Smartphones";	//any change made to a static variable impacts all the objects
		
		first.show();
		second.show();
		
	}

}
