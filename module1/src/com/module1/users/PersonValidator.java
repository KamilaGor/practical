package com.module1.users;

public class PersonValidator {
//	private String name;
//	private double age;
//	private double heigth;

//	public PersonValidator(String name, double age, double heigth) {
//		this.name = name;
//		this.age = age;
//		this.heigth = heigth;
//	}

	public boolean validateName(String name) {
		if(name != null) {
			return true;
		}else{
			return false;
		}
	}

	public void validateAgeAndHeight(double age, double height) {
		if(age > 30 && height >160) {
			System.out.println("User is older than 30 and higer than 160 cm");
		} else {
			System.out.println("User is younger than 30 or lower than 160 cm");
		}
	}

//	public String getName() {
//		return name;
//	}
//
//	public double getAge() {
//		return age;
//	}
//
//	public double getHeigth() {
//		return heigth;
//	}
}
