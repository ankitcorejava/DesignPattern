package com.singletondesignpattern;

import java.io.Serializable;

public class ProtectedSingleTon_From_Cloning implements Cloneable {

	private static ProtectedSingleTon_From_Cloning singleTonDesignPattern = null;

	private ProtectedSingleTon_From_Cloning() {

	}

	public static ProtectedSingleTon_From_Cloning getSingleTonDesign() {

		if (singleTonDesignPattern == null) {
			singleTonDesignPattern = new ProtectedSingleTon_From_Cloning();
		}
		return singleTonDesignPattern;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return singleTonDesignPattern;
	}
	
	
	

}
