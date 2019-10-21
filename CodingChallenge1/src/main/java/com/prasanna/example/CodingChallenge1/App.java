package com.prasanna.example.CodingChallenge1;

import java.util.ArrayList;
import java.util.List;

import com.prasanna.example.CodingChallenge1.Models.Department;
import com.prasanna.example.CodingChallenge1.Models.Employee;

/**
 * Hello world!
 *
 */
public class App {

	public static Department loadDepartment() {
		Department department = new Department();

		Employee developer = new Employee();
		developer.setJobFunction("Developer");
		developer.setMonthlyCost(2000);

		Employee managerE = new Employee();
		managerE.setJobFunction("ManagerE");
		managerE.setMonthlyCost(600);
		
		Employee managerD = new Employee();
		managerD.setJobFunction("ManagerD");
		managerD.setMonthlyCost(600);
		
		//Employee manager

		List<Employee> employesOfC = new ArrayList<Employee>();
		employesOfC.add(managerD);
		
		Employee managerC = new Employee();
		managerC.setJobFunction("ManagerC");
		managerC.setMonthlyCost(600);
		managerC.setReportees(employesOfC);


		List<Employee> reportees = new ArrayList<Employee>();
		reportees.add(developer);

		managerE.setReportees(reportees);

		List<Employee> managers = new ArrayList<Employee>();
		managers.add(managerE);
		managers.add(managerC);

		department.setEmployees(managers);

		return department;
	}

	public static int costOfDepartment(Department dept) {
		int totalcost = 0;

		for (Employee e : dept.getEmployees()) {
			totalcost += costOfEmployee(e);
		}

		return totalcost;
	}

	public static int costOfEmployee(Employee emp) {
		int totalCost = emp.getMonthlyCost();
		if (emp.getReportees() != null) {
			for (Employee e : emp.getReportees()) {
				totalCost += costOfEmployee(e);
			}
		}
		return totalCost;
	}

	public static void main(String[] args) {
		Department dept = loadDepartment();
		int cost = costOfDepartment(dept);
		System.out.println("cost of dept " + cost);
		
		

	}
}
