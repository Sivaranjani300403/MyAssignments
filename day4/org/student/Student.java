package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("sowmi");
	}
	public void studentId() {
		System.out.println("001");
	}
	public void studentDep() {
		System.out.println("bcom");
	}
	public static void main(String[] args) {
		
		Student sd=new Student();
		sd.collegeName();
		sd.collegeCode();
		sd.collegeRank();
		sd.deptName();
		sd.studentName();
		sd.studentId();
		sd.studentDep();
	}

}
