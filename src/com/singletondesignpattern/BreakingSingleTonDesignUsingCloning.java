package com.singletondesignpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingleTonDesignUsingCloning {	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		SingleTonDesignPattern ob1 = SingleTonDesignPattern.getSingleTonDesign();
		SingleTonDesignPattern ob2 = (SingleTonDesignPattern) ob1.clone();
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}

}
