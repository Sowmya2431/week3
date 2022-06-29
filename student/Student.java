package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Sowmya");
	}
	public void studentDept() 
	{
		System.out.println("Chemical");
	}
	public void studentId() 
	{
		System.out.println("06836B");
	}
	
	public static void main(String[] args) 
	{
		College Clg = new College();
		Clg.collegeName();
		Clg.collegeCode();
		Clg.collegeRank();
		
        Department dept=new Department();
		dept.deptName();
		
		Student stu = new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
	}
	
}
