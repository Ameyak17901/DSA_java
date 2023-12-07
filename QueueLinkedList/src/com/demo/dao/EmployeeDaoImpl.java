package com.demo.dao;

import com.demo.beans.Employee;
import com.demo.beans.Queue;

public class EmployeeDaoImpl implements EmployeeDao{
	static Queue q;
	static {
		q = new Queue();
		q.enqueue(new Employee(1,"Ameya Kulkarni","male"));
	}
	@Override
	public void insertEmployee(Employee e) {
		q.enqueue(e);
	}
	@Override
	public void remove() {
		q.dequeue();
		
	}
	@Override
	public void showAll() {
		q.display();
	}
	@Override
	public void displayMaleEmp() {
		q.search("male");	
	}
	@Override
	public void displayFemaleEmp() {
		q.search("female");
		
	}
	@Override
	public void empty() {
		q.emptyQueue();
	}
	@Override
	public void displayreverse() {
		q.reversePrint();
		
	}
}
