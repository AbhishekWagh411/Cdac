package assi4;

import java.io.Serializable;

public class Engine implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int speed ;
	private String type;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [speed=" + speed + ", type=" + type + "]";
	}
	
}
