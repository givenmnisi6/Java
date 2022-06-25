import java.util.Scanner;

public class prakFivePointOne {
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int anyNumber = 1;
		System.out.println("This game allows you to enter any number. (Enter 0 to exit the game)");
	
		while(anyNumber != 0) {
			System.out.printf("Enter any number: ");
			anyNumber = sc.nextInt();
			if(anyNumber > 0) {
				System.out.println("The number you entered is a positive number");
			} else if (anyNumber == 0){
				break;
			} else {
				System.out.println("The number you entered is a negative number");
			}
		}
	}
}