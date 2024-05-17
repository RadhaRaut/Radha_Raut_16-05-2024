package com.java;

public class Test extends Department {
	public void getDetails() {
		System.out.println("hello");
	}

	public void getDepartmentDetails() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
//		DatabBaseConnection d1= new DatabBaseConnection(13, "aadhar");
//		d1.getDetails();

		Student s1 = new Student();
		s1.getInfo();
		
		Test t = new Test();
		t.getDepartmentDetails();
		t.getDetails();

		// Orgnization o1= new Orgnization();

		// Department a1= new Department();

	}

}
