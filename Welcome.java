import java.util.*; //Reading input 

public class Welcome
{
	public static void main (String args[]) //Main method
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Your name is " + name);
	}
}