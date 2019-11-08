package com.module1coma1.animals;

public class AnimalRecognizer {

	public String recognize(Animal animal) {
		return "I'm sure that this is: " + animal.name()
				+ " and sounds like: " + animal.voice();
	}
}
