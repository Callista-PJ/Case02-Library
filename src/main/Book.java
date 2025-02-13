package main;

public class Book {
	private String title;
	private String isbn;
	private Author author;
	
	public Book(String title, String isbn, Author author) {
		this.title = title;
		this.isbn = isbn;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public String getIsbn() {
		return isbn;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void displayBook() {
		System.out.println("Title: " + getTitle());
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Author: " + getAuthor().getName());
		System.out.println("Biography: " + getAuthor().getBio());
		System.out.println("------------------------");
	}
}
