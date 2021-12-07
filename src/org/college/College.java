package org.college;

public class College {
public void collegeName() {
	System.out.println("College Name is SathayaBama University");
}
public void collegecode() {
	System.out.println("code is 600021");
}
public void collegeRank() {
	System.out.println("college Rank is 50");
}
public static void main(String[] args) {
	College o = new College();
	o.collegeName();
	o.collegecode();
	o.collegeRank();
	Student s = new Student();
	s.studentName();
	s.studentDept();
	s.studentid();
	Hostel h = new Hostel();
	h.hostelName();
	Dept d = new Dept();
	d.deptName();
}
}
