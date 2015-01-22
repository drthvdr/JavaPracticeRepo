package RaceCarDemo;

import java.util.Random;

public class Demo {
	
	public static void main (String[] args) {
		int maxSpeed = RaceCar.getMaxSpeedForAll();
		int raceLength = 1000;
		int currentLocation = 0;
		
		Random randomSpeed = new Random();
		
		RaceCar andretti = new RaceCar( 0, "Andretti", 0 );
		
		
		while ( andretti.getLocation() < raceLength ) {
			
			andretti.setSpeed( randomSpeed.nextInt(maxSpeed) );
			
			currentLocation += andretti.getSpeed();
			
			if ( currentLocation >= raceLength ){
				currentLocation = raceLength;
			}	
	
			andretti.setLocation(currentLocation);
			
			System.out.println( andretti.toString() );
			
		}
		
		System.out.println( "\n" + andretti.getName() + " has finished!");
	
	}

}
