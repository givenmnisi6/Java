import java.util.Scanner;

public class PrakThreePointOne {

	public static void main (String args[]) {
		int wordsWritten = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many words did you write? ");
		wordsWritten = sc.nextInt();
		
		if(wordsWritten <= 200) {
			System.out.println("This is a quick comment.");
		} else if (wordsWritten > 2000 && wordsWritten <= 15000) {
			System.out.println("This is a blog-post length.");
		} else if (wordsWritten > 500 && wordsWritten <= 2000) {
			System.out.println("This will work as a FAQ entry.");
		} else if (wordsWritten > 200 && wordsWritten <= 500) {
			System.out.println("This works as an email.");
		} else if (wordsWritten > 35000 && wordsWritten <= 80000) {
			System.out.println("You have written an ebook, nice!");
		} else if (wordsWritten > 15000 && wordsWritten <= 35000) {
			System.out.println("You have written an in-depth paper, good!");
		} else {
			System.out.println("You have written a novel, well done");
		}
	}
}