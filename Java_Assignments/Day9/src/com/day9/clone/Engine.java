package com.day9.clone;

public class Engine {
private int speed;

public Engine() {
	super();
}

public int getSpeed() {
	return speed;
}

public void setSpeed(int speed) {
	this.speed = speed;
}

@Override
public String toString() {
	return "Engine [speed=" + speed + "]";
}

}
