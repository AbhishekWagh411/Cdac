package com.day9.clone;

public class Car implements Cloneable {
private Engine e;
private String name;
public Car( String name) {
	super();
	this.e =new Engine();
	this.name = name;
}
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
	Car c= (Car)super.clone();
	c.e= new Engine();
	return c;
	}
@Override
public String toString() {
	return "Car [e=" + e + ", name=" + name + "]";
}

}
