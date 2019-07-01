package com.ser;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class EmpDeser {

	public static void main(String[] args) {
		//path of file with file name and extension
		String path="C:/Users/Amit/Desktop/FileHandling/emp.ser";

		//using File class
		File file=new File(path);

		//using FileOutputStream to read from file using Byte Stream method
		FileInputStream fin=null;

		//using ObjectInputStream  to Read from file using byte stream
		ObjectInputStream oin=null;
		
		try {
			
			fin=new FileInputStream(file);
			oin=new ObjectInputStream(fin);

			//Reading object from file ,return type Object type then Downcasting to Employee type
			Employee emp;
			emp = (Employee)oin.readObject();

		        while (emp != null) {
		  
		            emp =(Employee) oin.readObject();
		            System.out.println(emp);
		        }
			

			//close stream
			oin.close();
			fin.close();
			
		}
		catch(EOFException e)
        {                     
            System.out.println("EOF");
        }
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

