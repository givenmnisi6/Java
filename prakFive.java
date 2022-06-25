import java.util.Scanner;
import java.util.Random;

public class prakFive {
	
	public static void main(String args[]) {
		
		int numbersToDisplay;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number of values to display randomly: ");
		numbersToDisplay = sc.nextInt();
		
		int i = 0;
		Random rand = new Random();
		
		while(i < numbersToDisplay) {
			int randomNumbers = rand.nextInt(10)+1;
			System.out.println(randomNumbers);
			numbersToDisplay--;
		} 
	}
	
}