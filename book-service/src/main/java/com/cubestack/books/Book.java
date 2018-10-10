package com.cubestack.books;

public class Book {
	
	private int bookId;

	public Book() {}
	
	public Book(int bookId) {
		super();
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + "]";
	}
	
	

}
