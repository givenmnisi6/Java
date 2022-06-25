import java.util.Scanner;

public class PrakOne {
	public static void main(String args[]) {
		
		String firstName, lastName;		
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter your name: "); //printf - so that the user can enter their name in the first line
		firstName = input.next();				//prompts the user to enter their name and store it
		
		System.out.printf("Enter your surname: ");
		lastName = input.next();
		
		System.out.println("This program was written by: " + firstName + " " + lastName);
		System.out.println(input.nextLine());
		
		System.out.println("Square\n");
		
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		System.out.println("* * * * *");
		
		System.out.println("\nDiamond\n");	
		System.out.println("        *");
		System.out.println("       ***");
		System.out.println("      *****");
		System.out.println("     *******");
		System.out.println("    *********");
		System.out.println("   ***********");
		System.out.println("    *********");
		System.out.println("     *******");
		System.out.println("      *****");
		System.out.println("       ***");
		System.out.println("        *");
		
		System.out.println("Heart\n");
		
		
		System.out.println("  ****     ****");
		System.out.println(" ******   ******");
		System.out.println("******** ********");
		System.out.println("*****************");
		System.out.println(" ***************");
		System.out.println("  *************");
		System.out.println("   ***********");
		System.out.println("    *********");
		System.out.println("     *******");
		System.out.println("      *****");
		System.out.println("       ***");
		System.out.println("        *");
	}
}