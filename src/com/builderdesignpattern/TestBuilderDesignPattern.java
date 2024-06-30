package com.builderdesignpattern;

public class TestBuilderDesignPattern {

	public static void main(String[] args) {

		BuilderDesignPattern builderDesignPattern = new BuilderDesignPattern.InnerBuilder().setId(1).setName("Ankit")
				.setAddress("Chennai").build();
		
		System.out.println(builderDesignPattern);
	}

}
