package org.employee;

import org.client.Client;

//            class
public class EmployeeDetails {
	
	// private -> Access specifier for given method
	// void    -> return type
	// empName -> method name
	// ()      -> arguments place / input place / parameter place
	// {}      -> block of the method or body of the method
	// ""      -> String (accept all data)
	
	//           method1
	private void empName() {
		System.out.println("Employee name : anand");
	}
//  method1
	private void empMobile() {
		System.out.println("Employee mobile: 8939278836");
	}
//                    main method
	public static void main(String[] args) {
		
		Client cl = new Client();
		cl.clName();
		cl.clLocation();
		// object creation
		// ClassName ref = new ClassName();
		EmployeeDetails emp = new EmployeeDetails();
		// method call
		emp.empName();
		emp.empMobile();
		
		Company c = new Company();
		c.comName();
		c.comId();
		
		
	}
	
}
