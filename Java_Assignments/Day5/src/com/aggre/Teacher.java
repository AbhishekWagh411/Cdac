package com.aggre;

public class Teacher {
private int age ;
private String qualification,name;
public Teacher() {
	super();
}
public Teacher(int age, String qualification,String name) {
	super();
	this.age = age;
	this.qualification = qualification;
	this.name= name;
	
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Teacher [age=" + age + ", qualification=" + qualification + ", name=" + name + "]";
}	

}
