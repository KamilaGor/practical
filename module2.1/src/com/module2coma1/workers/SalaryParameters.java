package com.module2coma1.workers;

public class SalaryParameters {
	Double baseSalary;
	Double regulatedBonus;
	Double chefBonus;
	Double functionAddSalary;

	public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
		this.baseSalary = baseSalary;
		this.regulatedBonus = regulatedBonus;
		this.chefBonus = chefBonus;
		this.functionAddSalary = functionAddSalary;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "SalaryParameters{" +
				"baseSalary = " + baseSalary +
				", regulatedBonus = " + regulatedBonus +
				", chefBonus = " + chefBonus +
				", functionAddSalary = " + functionAddSalary +
				'}';
	}
}
