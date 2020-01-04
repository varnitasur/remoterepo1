package com.mindtree.serializedemoprog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationTest {

	
	  public void serialize(List<Student> studlist,String filename) { try {
	  ObjectOutputStream obj=new ObjectOutputStream(new
	  FileOutputStream(filename)); obj.writeObject(studlist); } catch (IOException
	  e) { System.out.println("problem occured during serialization");
	  System.out.println(e.getMessage()); }
	  
	  }
	 
	public List<Student> deserialize(String filename)
	{
		List<Student> studlist=null;
		try {
			ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename));
			studlist=(List<Student>)in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("prob occurred during deserialization");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return studlist;
	}
}
