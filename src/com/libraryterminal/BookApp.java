package com.libraryterminal;

import java.util.ArrayList;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> book = new ArrayList<>();
		
		book = BookHelper.readFromFile();
	}

}
