package com.java;

public interface Organization {
 // field
	//No non-static and static fields* 
	
	
	public static final int ORGNIZATION_ID = 234;  //only public, static & final are permitted
	public String ORGNIZATION_NAME= "IBM";         // Initialization is mandatory.
	
	//constructor
	
	//public Orgnization() {           //Interfaces cannot have constructors
		
	//}
	
	//method
	
	public abstract void getDetail();     //Abstract methods do not specify a body
		void Syso();
	//inner class
	
	//no object
	
}
