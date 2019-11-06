package com.module0.forum;

public class ForumUser extends User {

	private String userName;
	private int postNumber;
	private boolean isLogged;

	public ForumUser(String name, String lastname, char sex, int age, String email, String userName,
	                 int postNumber, boolean isLogged) {
		super(name, lastname, sex, age, email);
		this.userName = userName;
		this.postNumber = postNumber;
		this.isLogged = isLogged;
	}

	public void post() {
		super.singIn();
		System.out.println("Użytkownik: " + this.userName + " opublikował post" );
	}

	public void introduceUser() {
		System.out.println("Dane użytkownika: ");
		System.out.println("Imię: " + super.getName() + " Nazwisko: " + super.getLastname());
		System.out.println("Płeć: " + super.getSex() + " Age: " + super.getAge() + " Email: " + super.getEmail());
		System.out.println("Liczba postów: " + this.postNumber + " Zalogowany " + this.isLogged);
	}
}
