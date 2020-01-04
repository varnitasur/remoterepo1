package com.mindtree.filehandlling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filereading {

	public static void main(String[] args) {
		try {
			File obj= new File("D:\\filehandle\\file1.txt");
			Scanner myreader=new Scanner(obj);
			System.out.println("successfully writen");
			while(myreader.hasNextLine())
			{
				String data=myreader.nextLine();
				System.out.println(data);
			}
			
			myreader.close();
		} catch (FileNotFoundException e) {
			System.out.println("an error occured");

		}

	}
	
}
