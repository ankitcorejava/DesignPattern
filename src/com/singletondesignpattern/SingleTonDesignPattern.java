package com.singletondesignpattern;

import java.io.Serializable;

public class SingleTonDesignPattern implements Serializable,Cloneable, Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingleTonDesignPattern singleTonDesignPattern = null;

	private SingleTonDesignPattern() {

	}

	public static SingleTonDesignPattern getSingleTonDesign() {

		if (singleTonDesignPattern == null) {
			singleTonDesignPattern = new SingleTonDesignPattern();
		}
		
		System.out.println(singleTonDesignPattern.hashCode());
		return singleTonDesignPattern;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
