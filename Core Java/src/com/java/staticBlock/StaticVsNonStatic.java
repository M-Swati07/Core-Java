package com.java.staticBlock;

public class StaticVsNonStatic {

	int a = 10;
	static int b = 20;
	
	public static void main(String[] args) {
		StaticVsNonStatic s = new StaticVsNonStatic();
		StaticVsNonStatic.display();					//static method can be called just by classname.staticMethod()
		s.show();										//non-static method requires a object which will call the non-static method
	}
	
	static void display() {	
		System.out.println("Calling display() : "+b);	//static method will only access static variable
	}

	void show() {
		System.out.println("Calling show() : "+a+ " "+b);	//non-static method can access both static & non-static variable
	}
}
