package com.test.unittest.first;

public class Canine implements Animal {
    
	int legs = 4;
	String speech ;
	@Override
	public  String walk() {
		String str = "I walk on 4 legs";
		System.out.println(str);
		return str;
	}

	@Override
	public String eat() {
		String str = "I eat without hands";
		System.out.println(str);
		return str;		
	}
	public String modifiedwalk() {
		return " ";
	}
  
}
