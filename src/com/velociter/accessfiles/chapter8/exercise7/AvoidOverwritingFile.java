package com.velociter.accessfiles.chapter8.exercise7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class AvoidOverwritingFile {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath="C:/files/myFile.txt";//create java file object
		File myFile=new File(filepath);
		FileOutputStream outputFile=null;//// Stores the stream reference
	
		if(myFile.isFile()) {
			File newFile=myFile;// Start with the original file
		
		   do {
			String name = newFile.getName(); // Get the name of the file
			int period = name.indexOf('.'); // Find the separator for the extension
			if(period == -1)
			{
				newFile = new File(newFile.getParent(),name+"_old");
			}
			else
			{
			newFile = new File(myFile.getParent(), name.substring(0, period) + "_old" 
			+ name.substring(period));
			}
		   }
		   while(!myFile.renameTo(newFile));
		}
	
	
	
	
	// Now we can create the new file
	try {
	// Create the stream opened to append data
		outputFile = new FileOutputStream(myFile);
	System.out.println("File.txt output stream created");
	} 
	catch (FileNotFoundException e) {
	e.printStackTrace(System.err);
	} 
	System.exit(0);
		
		

	}

	}

