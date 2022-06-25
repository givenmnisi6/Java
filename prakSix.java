import java.util.Scanner;

public class prakSix {

	public static void main(String args[]) {
		int positiveNumber;
		int j = 1;
		Scanner sc = new Scanner(System.in); 
		System.out.printf("Enter any positive integer number: ");
		positiveNumber = sc.nextInt();
		
		for(int i = 0; i < positiveNumber; positiveNumber--) {
			System.out.print(positiveNumber + " ");
		}
		System.out.printf("\n-------------------------------------");
		
		System.out.printf("\nEnter any positive integer number: ");
		positiveNumber = sc.nextInt();
		
		while(j <= positiveNumber) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.printf("\n-------------------------------------");
		System.out.printf("\nCalculating factorial");
		
		int num = 1;
		while(num > 0) {
			System.out.printf("\n\nProvide a number: ");
			positiveNumber = sc.nextInt();
			
			if(positiveNumber < 0) {
				System.out.println("The number entered is negative.");
			} else {
				int factorial = 1;
				for(int i = 1; i <= positiveNumber; i++) {		//n! = n*(n-1)*(n-2)...*1
					factorial = factorial * i;					//1st iteration : 1 * 1 , 2nd: *2...
													
				}
				System.out.println("The factorial of " + positiveNumber + " is " + factorial);
				break;
			}
		}
		
		System.out.printf("\n-------------------------------------");
		System.out.printf("\nEnter any positive integer number: ");
		positiveNumber = sc.nextInt();
		
		int sum = 0;
		for(int i = 0; i < positiveNumber; positiveNumber--) {
			sum += positiveNumber;
		}
		System.out.print("The sum of the integers: " + sum);
	}
	
}