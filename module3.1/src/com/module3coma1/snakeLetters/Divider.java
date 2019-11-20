package com.module3coma1.snakeLetters;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Divider {

	List<String> evenResult = new ArrayList<>();
	List<String> oddResult = new ArrayList<>();

	public void divideToEvenOrOdd(ArrayDeque<String> letterQueue) {
		while (letterQueue.size() > 0) {
			String value = letterQueue.poll();
			int aNumber = value.length();
			if(aNumber % 2 == 0) {
				evenResult.add(value);
			} else {
				oddResult.add(value);
			}
		}
	}

	public List<String> getEvenResult() {
		return evenResult;
	}

	public List<String> getOddResult() {
		return oddResult;
	}
}
