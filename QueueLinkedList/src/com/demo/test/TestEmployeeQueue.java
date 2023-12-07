package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeQueue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		EmployeeService eservice = new EmployeeServiceImpl();
		int ch = 0;
		do {
			System.out.println("1. Insert\n2. Remove\n3. display All\n4. display male Emp\n5. display female Emp\n6. empty queue using recursion\n7. print in reverse order\n8. exit");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				eservice.addEmployee();
				break;
			case 2:
				eservice.deleteEmployee();
				break;
			case 3:
				eservice.displayAll();
				break;
			case 4:
				eservice.displayMaleEmployee();
				break;
			case 5:
				eservice.displayFemaleEmp();
				break;
			case 6:
				eservice.emptyQueue();
				break;
			case 7:
				eservice.printReverse();
				break;
			case 8:
				sc.close();
				System.out.println("Thank you for visiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while(ch != 8);

	}

}
