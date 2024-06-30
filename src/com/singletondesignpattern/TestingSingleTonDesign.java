package com.singletondesignpattern;

public class TestingSingleTonDesign {	
	
	
	public static void main(String[] args) {
		SingleTonDesignPattern ob1 = SingleTonDesignPattern.getSingleTonDesign();
		SingleTonDesignPattern ob2 = SingleTonDesignPattern.getSingleTonDesign();
		
		System.out.println(ob1.hashCode());
		
		System.out.println(ob2.hashCode());
	}
	

}
