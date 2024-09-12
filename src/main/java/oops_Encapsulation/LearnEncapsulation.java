package oops_Encapsulation;

public class LearnEncapsulation {

	/*
	 * Data Hiding
	 * no Access
	 * read-only access
	 * read/write access
	 */
	
	String name = "Thuwaiba";
	String studantId = "20409VA";
	private String employeeId = "20409";
	private int salary = 65000;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
//	
//	// Getter : read- only access
//	String getEmployeeTd() {
//		return  this.employeeId;
//	}
//	
//	// Setter : write access
//	void setEmpoyeeId(String employeeId) {
//		this.employeeId = employeeId;
//		System.out.println(employeeId);
//	}
//	
//	// Getter : read-only access
//	int getSalary() {
//		return this.salary;
//	}
//	
//	// Setter : Write-only 
//	void setSalary(int salary) {
//		this.salary = salary;
//	}
//	
//	
//	
	
	
}
