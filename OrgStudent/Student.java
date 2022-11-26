package OrgStudent;

import OrgDepartment.Department;

public class Student extends Department {
public void studentName() {
	System.out.println("Student Name: Chitra");
}
public void studentDept() {
	System.out.println("Student Department: Computer");
	
}
public void studentId() {
	System.out.println("Student Id: 2328");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student details= new Student();
		details.studentName();
		details.studentId();
		details.studentDept();
		details.deptName();
        details.collegeName();
        details.collegeCode();
        details.collegeRank();
	}

}
