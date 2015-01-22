package RaceCarDemo;

public class RaceCar {
	private int speed;
	private String name;
	private int location = 0;
	
	private static int maxSpeedForAll = 140;
	
	public RaceCar( int speed, String name , int location) {
		setSpeed(speed);
		setName(name);
		setLocation(location);
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if ( speed <= maxSpeedForAll) {
			this.speed = speed;
		} else {
			this.speed = maxSpeedForAll;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public static int getMaxSpeedForAll() {
		return maxSpeedForAll;
	}

	public static void setMaxSpeedForAll(int maxSpeedForAll) {
		RaceCar.maxSpeedForAll = maxSpeedForAll;
	}
	
	public String toString() {
		
		String result;
		
		result = name + " Speed: " + speed + " Location: " + location;
		
		return result;
	}

}
