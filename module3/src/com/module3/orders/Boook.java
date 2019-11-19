package com.module3.orders;

public class Boook {
	String title;
	String author;
	int year;

	public Boook(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Title \'" + title + "\", author: " + author + ", (" + year + ")";
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
}
