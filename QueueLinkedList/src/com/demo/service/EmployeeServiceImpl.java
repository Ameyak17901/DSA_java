package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao edao;
	
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}
	@Override
	public void addEmployee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		String nm = sc.nextLine();
		System.out.println("Enter the gender");
		String g = sc.next();
		
		Employee e = new Employee(id,nm,g);
		edao.insertEmployee(e);
		
	}
	@Override
	public void deleteEmployee() {
		edao.remove();
		
	}
	@Override
	public void displayAll() {
		edao.showAll();
		
	}
	@Override
	public void displayMaleEmployee() {
		edao.displayMaleEmp();
		
	}
	@Override
	public void displayFemaleEmp() {
		edao.displayFemaleEmp();
		
	}
	@Override
	public void emptyQueue() {
		edao.empty();
		
	}
	@Override
	public void printReverse() {
		edao.displayreverse();
	}

}
