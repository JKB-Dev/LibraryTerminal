package com.libraryterminal;

import java.util.ArrayList;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<>();
		
		bookList = BookHelper.readFromFile();
		System.out.println(bookList.toString(););
	}
	
	
	
	

}
