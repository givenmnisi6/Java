import java.util.Scanner;
public class GreetAFriend
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a name: ");
		String FriendName=input.nextLine();
		System.out.println("Hello "+FriendName);
		System.out.println("how are you");
	}
}