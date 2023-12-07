package com.demo.dao;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void insertEmployee(Employee e);

	void remove();

	void showAll();

	void displayMaleEmp();

	void displayFemaleEmp();

	void empty();

	void displayreverse();

}
