package com.streamquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

	private String name;
	private int age;
	private float salary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}

public class EmployeeSorting {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>(Arrays.asList(
				new Employee("Lochana",22,18500),
				new Employee("Prasad",22,27878),
				new Employee("Shweta",25,32890),
				new Employee("Prabhas",45,76558),
				new Employee("Deva",47,675200),
				new Employee("Potti",22,4500)
				));
		
		//Comparator<Employee> cmp = (e1,e2)->Integer.compare(e2.getAge(), e1.getAge());
		Comparator<Employee> cmp = new Comparator<Employee>() {
			
			public int compare(Employee o1, Employee o2) {
				if(o1.getAge()>o2.getAge()) {
					return -1;
				}
				else if(o1.getAge()==o2.getAge()) {
					if(o1.getSalary()>o2.getSalary()) {
						return 1;
					}
					else {
						return -1;
					}
				}
				else {
					return 1;
				}
			}
		};
		Collections.sort(list,cmp);
		
		for(Employee emp : list) {
			System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
		}
		

	}
}
