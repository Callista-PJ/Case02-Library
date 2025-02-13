package main;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
	private String name;
	private List<Book> borrowedBooks;
	
	public Borrower(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}

	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
	
	public void displayBorrowedBooks() {
		System.out.println(name + "'s Borrowed Books:");
		for(Book book : borrowedBooks) {
			book.displayBook();
		}
	}
	
}
