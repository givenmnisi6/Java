import java.util.Scanner;

public class prakFivePointTwo {
	public static void main (String args[]) {
		double value = 1;
		double sumOfTheValues = 0;
		int n = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This program allows you to calculate a total. (Enter a negative number to stop)");
		
		while(value > 0) { 
			System.out.printf("Enter value number " + n + " : ");
			value = sc.nextDouble();
			if(value > 0) {
				sumOfTheValues += value;
			} 
			n++;			
		}
		System.out.printf("The sum of the values =  " + sumOfTheValues);
	}
	
}