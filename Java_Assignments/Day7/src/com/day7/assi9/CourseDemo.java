package com.day7.assi9;

public class CourseDemo {
public static void main(String[] args) {
	Course c[]= new Course[3];
	c[0]= new DACDBDACourse();
	c[1]= new MSCit();
	c[2]= new Basic();
	
	for (Course course : c) {
		course.start();
		if(course instanceof DACDBDACourse) {
			DACDBDACourse d = (DACDBDACourse) course;
			d.orientation();
		}
		course.stop();
	}
}
}
