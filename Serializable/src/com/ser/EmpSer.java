package com.ser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmpSer {

	public static void main(String[] args) {
		String path="C:/Users/Amit/Desktop/FileHandling/emp.ser";
		
		//creating object
		Employee emp=new Employee(1, "Amit", 50000);
		Employee emp2=new Employee(2, "At", 50000);
		Employee em3=new Employee(3, "Ait", 50000);
		Employee em4=new Employee(4, "Ai", 50000);
		Employee emp5=new Employee(1, "Amit", 50000);
		Employee emp6=new Employee(2, "At", 50000);
		Employee em7=new Employee(3, "Ait", 50000);
		Employee em8=new Employee(4, "Ai", 50000);
		
		//using File class
		File file=new File(path);
		
		//using FileOutputStream to create writing method
		FileOutputStream fout=null;
		
		//using ObjectOutputStream  to write to file using byte stream
		ObjectOutputStream oout=null;
		try {
			fout=new FileOutputStream(file);
			oout=new ObjectOutputStream(fout);
			
			//write to object to file
			oout.writeObject(emp);
			oout.writeObject(emp2);
			oout.writeObject(em3);
			oout.writeObject(em4);
			
			oout.writeObject(emp5);
			oout.writeObject(emp6);
			oout.writeObject(em7);
			oout.writeObject(em8);
			
			//close stream
			oout.close();
			fout.close();
			
			//message
			System.out.println("Object written to file");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

