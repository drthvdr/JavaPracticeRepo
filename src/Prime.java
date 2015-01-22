import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		int number;
		boolean isPrime = true;
		
		System.out.print("Enter a an integer: ");
		number = keyboard.nextInt();
		
		for ( int factor = 2; factor < number; factor++ ) {
			
			if ( number % factor == 0 ) {
				isPrime = false;
			
			}
		}
		
		if ( isPrime ) {
			System.out.println( number + " is Prime. \n");
		}
		
		else {
			System.out.println( number + " is not Prime. \n");
		}

	}

}
