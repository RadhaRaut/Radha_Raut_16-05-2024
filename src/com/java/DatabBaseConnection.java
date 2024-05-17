package com.java;

final class DatabBaseConnection {

	// field
	private int dataId = 14;
	private String dataName = "passport";

//constructor
	public DatabBaseConnection() {

	}

//	public DatabBaseConnection(int dataId, String dataName) {
//
//		this.dataId = dataId;
//		this.dataName = dataName;
//	}
// method
	public void getDetails() {
		System.out.println(dataId);
		System.out.println(dataName);
	}
	
	public static void main(String[] args) {
		
//		DatabBaseConnection a1= new DatabBaseConnection(13,"aadhar");
//		a1.getDetails();
		
	}
}
