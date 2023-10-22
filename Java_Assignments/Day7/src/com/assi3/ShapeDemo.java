package com.assi3;
abstract class Shape{
	abstract void draw();
	public void show() {
		System.out.println("show shape");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("drawing Triangle");
	}
}
class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("Drawing Rectangle");
	}
	
}
class Circle extends Shape{

	@Override
	void draw() {
	System.out.println("Drawing Circle");	
	}
	
}
public class ShapeDemo {
	static void  perform(Shape s) {
		s.draw();
		s.show();
	}
	public static void main(String[] args) {
		perform(new Triangle());
		perform(new Rectangle());
		perform(new Circle());
	}
}
