import java.util.Scanner;

public class example {
	private int empid;
	private String empname;
	private double salary;
	static int nam=6;;
	public example() {
		super();
	}
	
	
	
	public example(int empid, String empname, double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {
		System.out.println("Employee id" +" " + empid);
		System.out.println("Employee name" +" "+ empname);
		System.out.println("Employee salary" +" "+ salary);
		nam=8;
	}
}

