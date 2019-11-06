package com.module0;

public class Person {
	private String name;
	private int age;
	private double height;
	private char sex;
	private boolean isGoodProgramer;

	public Person(String name, int age, double height, char sex, boolean isGoodProgramer) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.sex = sex;
		this.isGoodProgramer = isGoodProgramer;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public char getSex() {
		return sex;
	}

	public boolean isGoodProgramer() {
		return isGoodProgramer;
	}
}
