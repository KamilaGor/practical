package com.module1coma1.algorithm;

abstract class ComplicatedAlgorithm {

	abstract protected void firstMethodToExecute();//wymaga własnej implementacji

	abstract protected void secondMethodToExecute();//wymaga własnej implementacji

	private void thirdMethodToExecute() {
		System.out.println("This is third method to execute!");
	}

	private void fourthMethodToExecute() {
		System.out.println("This is fourth method to execute!");
	}

	public void run() {
		this.firstMethodToExecute();
		this.secondMethodToExecute();
		this.thirdMethodToExecute();
		this.fourthMethodToExecute();
	}
}
