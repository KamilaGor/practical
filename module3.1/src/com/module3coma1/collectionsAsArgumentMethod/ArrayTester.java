package com.module3coma1.collectionsAsArgumentMethod;

import java.util.ArrayList;

public class ArrayTester {

	public void printEven(ArrayList<Integer> theList) {
		int temporaryValue = 0;
		for(int n=0; n<theList.size(); n++) {
			temporaryValue = theList.get(n);
			if(temporaryValue % 2 == 0) {
				System.out.print(temporaryValue + ", ");
			}
		}
	}
}
