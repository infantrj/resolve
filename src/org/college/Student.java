package org.college;

public class Student {
public void studentName() {
	System.out.println("Student name is ricky");
}
public void studentDept() {
	System.out.println("Student dept is Mechanical");
}
public void studentid() {
	System.out.println("student id is 2519");
}
public static void main(String[] args) {
	Student s = new Student();
	s.studentName();
	s.studentDept();
	s.studentid();
}
}
