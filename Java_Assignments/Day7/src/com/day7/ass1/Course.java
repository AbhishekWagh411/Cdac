package com.day7.ass1;

public abstract class Course {
	public void start()
	{
		System.out.println("Start Process");
	}
	public abstract double getFee();
	public abstract void evaluate();

}
