package com.practice;

import java.io.Serializable;

public class Car implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = -3790303355537305088L;
private Engine engine;
private String type;


public Car(Engine engine, String type) {
	super();
	this.engine = engine;
	this.type = type;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Car [engine=" + engine + ", modelName=" + type + "]";
}

}
