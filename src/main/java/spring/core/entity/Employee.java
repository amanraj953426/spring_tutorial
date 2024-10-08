package spring.core.entity;

import java.sql.SQLNonTransientConnectionException;

public class Employee {




	private int Id;
	private String name;
	private String gender;
	
	private Address address;
	
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
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	
	public Employee(int id, String name, String gender, Address address) {
		super();
		Id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}


	
	
	
}
