package spring.core.entity;

import java.sql.SQLNonTransientConnectionException;

public class Employee {




	private int Id;
	private String name;
	private String gender;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		System.out.println("Employee.getName()");
		return name;
	}
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	public String getGender() {
		System.out.println("Employee.getGender()");
		return gender;
	}
	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}
	public Employee(int id, String name, String gender) {
		super();
		Id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Employee.Employee(3)");
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", gender=" + gender + "]";
	}
	
	
	
}
