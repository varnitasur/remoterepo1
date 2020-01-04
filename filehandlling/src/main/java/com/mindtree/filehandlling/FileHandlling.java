package com.mindtree.filehandlling;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;

public class FileHandlling {
	public static void main(String[] args) {
		try {
		File myobj=new File("D:\\filehandle\\file1.txt");
		if(myobj.createNewFile())
		{
			System.out.println("File created"+myobj.getName());
		}
		else {
			System.out.println("File already exists");
		}
		}catch(IOException e)
		{
			System.out.println("an error occured");
			
		}
		
	}
}
