package com.singletondesignpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Testing_Protected_SingleTonDesignUsingReflectionAPI {	
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		ProtectedSingleTon_From_ReflectionAPI ob1 = ProtectedSingleTon_From_ReflectionAPI.getSingleTonDesign();
		System.out.println(ob1.hashCode());
		
		Constructor<ProtectedSingleTon_From_ReflectionAPI> cons = ProtectedSingleTon_From_ReflectionAPI.class.getDeclaredConstructor();
		cons.setAccessible(true);		
		ProtectedSingleTon_From_ReflectionAPI ob2  = cons.newInstance();
		System.out.println(ob2.hashCode());
	}
	

}
