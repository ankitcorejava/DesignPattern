package com.singletondesignpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakingSingleTonDesignUsingReflectionAPI {	
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		SingleTonDesignPattern ob1 = SingleTonDesignPattern.getSingleTonDesign();
		System.out.println(ob1.hashCode());
		
		Constructor<SingleTonDesignPattern> cons = SingleTonDesignPattern.class.getDeclaredConstructor();
		cons.setAccessible(true);		
		SingleTonDesignPattern ob2  = cons.newInstance();
		System.out.println(ob2.hashCode());
	}
	

}
