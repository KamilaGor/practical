package com.module3coma1.forWhileLinkedList;

public class MyObject {
	int value = 0;

	public MyObject(int value) {
		this.value = value;
	}

	public boolean equals(Object o){
		MyObject myObj = (MyObject) o;
		if(myObj.getValue() == value){
			return true;
		} else {
			return false;
		}
	}

	public int getValue() {
		return value;
	}
}
