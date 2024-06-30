package com.singletondesignpattern;

public class ProtectedSingleTon_From_ReflectionAPI {

	private static ProtectedSingleTon_From_ReflectionAPI singleTonDesignPattern = null;

	private ProtectedSingleTon_From_ReflectionAPI() {

		if (singleTonDesignPattern != null) {
			
			throw new RuntimeException(" Tried breaking SingleTon Design Pattern using Reflection API..");
		}
	}

	public static ProtectedSingleTon_From_ReflectionAPI getSingleTonDesign() {

		if (singleTonDesignPattern == null) {
			singleTonDesignPattern = new ProtectedSingleTon_From_ReflectionAPI();
		}
		return singleTonDesignPattern;
	}

}
