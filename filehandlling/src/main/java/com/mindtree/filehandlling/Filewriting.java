package com.mindtree.filehandlling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriting {

	public static void main(String[] args) {
		try {
			FileWriter mywriter = new FileWriter("D:\\filehandle\\file1.txt");
			mywriter.write("java is the prominent language");
			mywriter.close();
			System.out.println("successfully writen");

		} catch (IOException e) {
			System.out.println("an error occured");

		}

	}

}
