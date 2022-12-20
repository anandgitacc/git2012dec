package org.employee;

public class EmployeeDetails {
	
	// private -> Access specifier for given method
	// void    -> return type
	// empName -> method name
	// ()      -> arguments place / input place / parameter place
	// {}      -> block of the method or body of the method
	
	// ""      -> String (accept all data)
	private void empName() {
		System.out.println("Employee name : anand");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}

	public static void main(String[] args) {
		
		// ClassName ref = new ClassName();
		EmployeeDetails e = new EmployeeDetails();
		
		e.empName();
		e.empMobile();
		
		
	}
	
}
