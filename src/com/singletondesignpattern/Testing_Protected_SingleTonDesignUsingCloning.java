package com.singletondesignpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Testing_Protected_SingleTonDesignUsingCloning {	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		ProtectedSingleTon_From_Cloning ob1 = ProtectedSingleTon_From_Cloning.getSingleTonDesign();
		ProtectedSingleTon_From_Cloning ob2 = (ProtectedSingleTon_From_Cloning) ob1.clone();
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}

}
