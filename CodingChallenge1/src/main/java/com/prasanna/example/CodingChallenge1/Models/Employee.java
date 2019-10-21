package com.prasanna.example.CodingChallenge1.Models;

import java.util.List;

public class Employee {

	String jobFunction;
	int monthlyCost;
	List<Employee> reportees;
	
	public String getJobFunction() {
		return jobFunction;
	}
	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}
	public int getMonthlyCost() {
		return monthlyCost;
	}
	public void setMonthlyCost(int monthlyCost) {
		this.monthlyCost = monthlyCost;
	}
	public List<Employee> getReportees() {
		return reportees;
	}
	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}
	
	
	
}
