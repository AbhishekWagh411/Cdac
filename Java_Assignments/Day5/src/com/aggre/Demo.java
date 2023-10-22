package com.aggre;

public class Demo {
		public static void main(String[] args) {
			Teacher teacher = new Teacher(31, "B.Tech","Tejal Mate");
			Department department= new Department("Physics");
			//System.out.println(department.getTeacher());
//			System.out.println(teacher.toString());
			department.setTeacher(teacher);
			department=null;
			System.out.println(teacher.toString());
			System.out.println(department.toString());
		}
}
