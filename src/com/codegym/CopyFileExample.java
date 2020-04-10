package com.codegym;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileExample {

    public static void main(String[] args) {
	    FileInputStream inputStream = null;
	    FileOutputStream outputStream = null;

	    try {
	        File inFile = new File("MyInputFile.txt");
	        File outFile = new File("MyOutputFile.txt");

	        inputStream = new FileInputStream(inFile);
	        outputStream = new FileOutputStream(outFile);

	        byte[] bytes = new byte[1024];
	        int length;

	        while ((length = inputStream.read(bytes)) > 0) {
	            outputStream.write(bytes, 0, length);
            }

	        inputStream.close();
	        outputStream.close();

            System.out.println("File Copied Successfully!!");

        } catch (IOException ioe) {
	        ioe.getMessage();
        }
    }
}
