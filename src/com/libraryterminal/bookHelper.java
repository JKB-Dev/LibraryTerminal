package com.libraryterminal;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//helper class
public class bookHelper {

	public static void readFromFile() {

		// creating a read file class

		String fileName = "booklist.txt"; // my txt file name

		Path filePath = Paths.get(fileName);
		File file = filePath.toFile(); // converting path to a file for future uses

		// trying to read from reader

		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr); // create new string for buffer
			// will act like scanner

			String lineRead = reader.readLine(); // will read each line from reader
			while (lineRead != null) {
				System.out.println(lineRead);
				lineRead = reader.readLine(); // this will read the next line
			}
			reader.close();

			// } catch (FileNotFoundException e) {

		} catch (IOException e) { // catching it from parent class using catch clause
			System.out.println("This book does not exist..");

		}
	}
		
		public static void writeToFiles(String book) { //is this part right?***
			String fileName = "booklist.txt";
			Path writeFile = Paths.get(fileName);
			File file = writeFile.toFile();
			
			try {
				PrintWriter outW = new PrintWriter(new FileOutputStream(file)) ; 
				//no "true", it will overwrite the entire txt file each time
				outW.println(book);
				outW.close();
			
			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
			}
			
			
		}
		
		public static void createFile() { //this is to create a new file if it's not created yet
			String fileName = "booklist.txt";
			Path createFile = Paths.get(fileName);
			
			if (Files.notExists(createFile)) { //checking if the file exists
				
				try {
					Files.createFile(createFile);
					System.out.println("This book has been successfully stored!");
				} catch (IOException e) {
					System.out.println("Something went wrong..");
				}
			}
		}
}
		
		

	
	
	
	
	
	


