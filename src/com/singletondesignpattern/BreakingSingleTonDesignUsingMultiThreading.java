package com.singletondesignpattern;

public class BreakingSingleTonDesignUsingMultiThreading implements Runnable {

	public static void main(String[] args) throws CloneNotSupportedException {

		BreakingSingleTonDesignUsingMultiThreading obj = new BreakingSingleTonDesignUsingMultiThreading();
		obj.run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(SingleTonDesignPattern.getSingleTonDesign());
		Thread thread2 = new Thread(SingleTonDesignPattern.getSingleTonDesign());
		thread1.start();
		thread2.start();

	}

}
