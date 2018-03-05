package com.rahuls;

import java.awt.Desktop;
import java.io.File;

public class OpenFile {
	public static void main(String[] args) {
		try {
			Desktop dt = Desktop.getDesktop();
		    dt.open(new File(args[0]));
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Please provide valid file path as an argument."+ex.getMessage());
		}catch(IllegalArgumentException ex) {
			System.out.println("The file doesn't exist."+ex.getMessage());
		}catch(Exception ex) {
			System.out.println("Exception\\Error: "+ex.getMessage());
		}
	}
}
