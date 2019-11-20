package com.module3coma1.books;

public class Book {
	String title;
	String author;
	int year;

	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Title: " + title + " Author: " + author + " (" + year + ");";
	}
}
