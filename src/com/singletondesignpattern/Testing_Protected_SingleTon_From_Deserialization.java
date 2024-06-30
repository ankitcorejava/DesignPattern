package com.singletondesignpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Testing_Protected_SingleTon_From_Deserialization {	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Serialization::
		Protected_SingleTonDesignPattern_From_DeSerialization ob1 = Protected_SingleTonDesignPattern_From_DeSerialization.getSingleTonDesign();
		System.out.println(ob1.hashCode());
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\ankit\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\DesignPattern\\src\\com\\singletondesignpattern\\test2.txt");
		ObjectOutputStream objOput = new ObjectOutputStream(fos);
		objOput.writeObject(ob1);

		// DeSerialization::
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ankit\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\DesignPattern\\src\\com\\singletondesignpattern\\test2.txt");
		ObjectInputStream objInput = new ObjectInputStream(fis);
		Protected_SingleTonDesignPattern_From_DeSerialization ob2 = (Protected_SingleTonDesignPattern_From_DeSerialization) objInput.readObject();
		System.out.println(ob2.hashCode());

	}

	

}
