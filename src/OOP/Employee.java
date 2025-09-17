package OOP;

public class Employee {
	String Name;
	int Salary, EmployeeNo;
	
	public Employee(String name,int empno , int salary) {
		Name = name;
		EmployeeNo = empno;
		Salary = salary;
	}
	
	public void DisplayEmp() {
		System.out.println(Name);
		System.out.println(EmployeeNo);
		System.out.println(Salary);
	}
}
