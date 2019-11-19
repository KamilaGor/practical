package com.module3.books;

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
	public boolean equals(Object o) {
		Book e = (Book) o;
		return title.equals(e.getTitle()) && author.equals(e.getAuthor()) && year == e.getYear();
	}

	@Override
	public int hashCode() {
		return title.hashCode() + author.hashCode() + year;
	}

	@Override
	public String toString() {
		return "Title = '" + title + '\'' +
				", author = '" + author + '\'' +
				", year = " + year +
				'}';
	}
}
