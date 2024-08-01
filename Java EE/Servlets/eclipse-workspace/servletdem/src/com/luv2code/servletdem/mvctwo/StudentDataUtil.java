package com.luv2code.servletdem.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	public static List<Student> getStudents(){
		List <Student> students =new ArrayList<>();
		students.add(new Student("Haneen","Mohamed","haneen.m.elfeky@gmail.com"));
		students.add(new Student("Hon","Ahmed","hanoona0010@gmail.com"));
		students.add(new Student("Hena","Mohamed","hennaa1234@gmail.com"));
		students.add(new Student("Mohamed","Ahmed","mohamed199@gmail.com"));
		return students;
	}

}
