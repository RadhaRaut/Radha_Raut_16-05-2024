package com.java;
//Abstract Class

public abstract class Department {
// field
	private int departmentId;
	private String departmentName;

	// constructor

	public Department() {

	}

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	// Block
	static {

	}

	// method

	public void getDetails() {

	}

	public abstract void getDepartmentDetails(); // Abstract methods do not specify a body

	// inner class

	// no object
}
