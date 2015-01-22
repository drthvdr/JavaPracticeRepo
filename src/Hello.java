import java.util.Scanner;




public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World!\n");
		
//		boolean result;
//		
//		result = 2 > 4.5;
//		
//		if ( result == true ) {
//			System.out.println("This shit is " + result + ", son");
//		}
//		
//		else {
//			System.out.println("This shit is " + result + ", son");
//		}
//		
//		int choice = 1;
//		char letter = 'A';
//		
//		switch( letter ) {
//		case 'A':
//			System.out.println("choice is A");
//			break;		
//		case 'B':
//			System.out.println("choice is B");
//			break;
//			
//		default:
//			System.out.println("letter is neither A nor B");
//			break;
//		}
		
//		Conditional operator, Ternary operator
		
//		int a;
//		
//		a = 12 > 5 ? 23 : 4;
//		
//		System.out.println( 23 > 5 ? 9 : 6);

/* While loop
 * 
		int count = 1, sum = 0;
		
		while ( count <= 100) {
			
			System.out.println(count);
			sum += count;
			count++;
		}
		
		System.out.println(sum);
	*/
		
		Scanner keyboard = new Scanner (System.in);
		int grade, sum = 0, count = 0;
		double avg;
		
		System.out.println("Enter a grade (-1 to quit): ");
		grade = keyboard.nextInt();
		
		while ( grade != -1 ){
			sum += grade;
			count++;
			
			System.out.println("Enter a grade (-1 to quit): \n");
			grade = keyboard.nextInt();
		}
		System.out.println("The sum is: " + sum);
		
		avg = sum/count;
		
		System.out.println("The average grade is: " + avg);
	
	
	}
}
