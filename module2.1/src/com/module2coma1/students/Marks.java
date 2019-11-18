package com.module2coma1.students;

public class Marks {
	Integer Maths;
	Integer English;
	Integer Art;
	Integer Biology;
	Integer History;

	public Marks(Integer maths, Integer english, Integer art, Integer biology, Integer history) {
		Maths = maths;
		English = english;
		Art = art;
		Biology = biology;
		History = history;
	}

	public Double getAverage() {
		return (this.Maths + this.English + this.Art + this.Biology + this.History) /5.0;
	}

//	@Override
//	public String toString() {
//		return "Marks{" +
//				"Maths = " + Maths +
//				", English = " + English +
//				", Art = " + Art +
//				", Biology = " + Biology +
//				", History = " + History +
//				'}';
//	}
}
