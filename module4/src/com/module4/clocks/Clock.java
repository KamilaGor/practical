package com.module4.clocks;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clock {
	public LocalTime time;

	public Clock(int hour, int minute, int sec) {
		this.time = LocalTime.of(hour, minute, sec);
	}

	public LocalTime getTime() {
		return time;
	}

	public void setHour(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Clock: " + time;
	}
}
