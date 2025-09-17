package OOP;

public class RunnerClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Arnel", 1001, 10000);
//		emp1.Name = ;
//		emp1.EmployeeNo = 1001;
//		emp1.Salary = 10000;
		emp1.DisplayEmp();
		
		Employee emp2 = new Employee("Ivy", 1002, 15000);
//		emp2.Name = "Ivy;
//		emp2.EmployeeNo = 1002;
//		emp2.Salary = 15000;
		emp2.DisplayEmp();
		
		Employee emp3 = new Employee("Jame", 1003, 12000);
		emp3.DisplayEmp();
		
		ParentClass P1 = new ParentClass();
		P1.Grade = 10;
		P1.Name = "Mike";
		P1.RollNo = 100;
		
		ChildClass C1 = new ChildClass();
		C1.SchoolName = "Oxford";
		C1.Grade = 8;
		C1.Name = "John";
		C1.RollNo = 101;
		
	}
}
