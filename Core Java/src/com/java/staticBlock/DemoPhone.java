package com.java.staticBlock;

/*If we want static method to access non-static members, then pass the object in the parameter when calling that method
and access those members using that object as in line no : 10*/

public class DemoPhone {
	
	String brand;
	int price;
	static String name;
	
	static void show(DemoPhone phone) {
		System.out.println(phone.brand+" "+phone.price+" "+name);
	}

	public static void main(String[] args) {
		
		DemoPhone phone = new DemoPhone();
		phone.brand = "Huawei";
		phone.price = 1000;
		DemoPhone.name = "Redmi Note 15";
		
		DemoPhone.show(phone);		
		
	}

}
