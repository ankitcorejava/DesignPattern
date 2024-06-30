package com.singletondesignpattern;

import java.io.Serializable;

public class Protected_SingleTonDesignPattern_From_DeSerialization implements Serializable {

	private static final long serialVersionUID = 1L;
	private static Protected_SingleTonDesignPattern_From_DeSerialization singleTonDesignPattern = null;

	private Protected_SingleTonDesignPattern_From_DeSerialization() {

	}

	public static Protected_SingleTonDesignPattern_From_DeSerialization getSingleTonDesign() {

		if (singleTonDesignPattern == null) {
			singleTonDesignPattern = new Protected_SingleTonDesignPattern_From_DeSerialization();
		}
		return singleTonDesignPattern;
	}

	public Object readResolve() {
		return singleTonDesignPattern;
	}

}
