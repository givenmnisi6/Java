import java.util.Scanner;

public class LoanCalculator {
	public static void main(String args[]) {
		
		int interest;
		int amountRemaining = 0;
		int amountLoaned;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter the amount you want to loan: "); 
		amountLoaned = sc.nextInt();
	
		int totalRemaining = 0;
		for(int i = 1; i <= 3; i++) {
			interest = (amountLoaned * 10/100);
			amountRemaining = amountLoaned - interest ;
			amountLoaned = amountRemaining;
		}
		System.out.printf("Interest after 3 months: " + amountRemaining);

	}
}