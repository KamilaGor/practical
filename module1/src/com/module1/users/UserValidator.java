package com.module1.users;

public class UserValidator {

	public boolean validateAge(int age) {
		if(age > 15) {
			System.out.println("User age is okej!");
			return true;
		}else{
			System.out.println("User is too young!");
			return false;
		}

	}

	public void validateSex(char sex) {
		if(sex == 'f') {
			System.out.println("User is female!");
		}else if(sex == 'm') {
			System.out.println("User is male");
		} else {
			System.out.println("Sex is unkown!");
		}

	}
}
