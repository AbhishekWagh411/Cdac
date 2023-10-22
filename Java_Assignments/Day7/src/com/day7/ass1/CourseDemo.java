package com.day7.ass1;

public class CourseDemo {
	static void perform(Course course) {
		course.start();
		System.out.println("Course fee:- "+course.getFee());
		course.evaluate();
	}
public static void main(String[] args) {
	Course course1 = new DACDBDACourse();
	Course course2= new MSCitCourse();
	perform(course1);
	perform(course2);
}
}
