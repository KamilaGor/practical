package com.module0;

public class User {
	private String name;
	private String lastname;
	private char sex;
	private int age;
	private String email;

	public User(String name, String lastname, char sex, int age, String email) {
		this.name = name;
		this.lastname = lastname;
		this.sex = sex;
		this.age = age;
		this.email = email;
	}

	public void singIn() {
		System.out.println("Użytkwonik zalogowany");
	}

	public void deleteUser() {
		System.out.println("Użytkownik usunięty!");
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}

	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}
}
