package com.singletondesignpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakingSingleTonDesignUsingDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Serialization::
		SingleTonDesignPattern ob1 = SingleTonDesignPattern.getSingleTonDesign();
		System.out.println(ob1.hashCode());
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\ankit\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\DesignPattern\\src\\com\\singletondesignpattern\\test.txt");
		ObjectOutputStream objOput = new ObjectOutputStream(fos);
		objOput.writeObject(ob1);

		// DeSerialization::
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ankit\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\DesignPattern\\src\\com\\singletondesignpattern\\test.txt");
		ObjectInputStream objInput = new ObjectInputStream(fis);
		SingleTonDesignPattern ob2 = (SingleTonDesignPattern) objInput.readObject();
		System.out.println(ob2.hashCode());

	}

}
