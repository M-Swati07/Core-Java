package com.java.staticBlock;

public class Cat {

	String name;
	int age;
	static int livesRemaining;
	static int count = 0;
	static final int MAX_LIVES = 9;
	
	//non-static method
	public void nonStaticMethod() {
		System.out.println("Meow");
	}
	
	//static method will access static variable only
	static int count() {
		return count++;		
	}
	
	public static void main(String[] args) {
		
		//non-static will need an object to call the instance variables or methods
		Cat cat = new Cat();
		cat.name = "Kenny";
		cat.age = 5;
		cat.nonStaticMethod();
		System.out.println(cat.name + " "+cat.age);
		cat.count();
		cat.livesRemaining = cat.MAX_LIVES - cat.age;
		
		System.out.println("Count of cat : "+Cat.count());
		System.out.println("Lives Remaining : "+Cat.livesRemaining);
	}

}
