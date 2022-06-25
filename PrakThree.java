import java.util.Scanner;

public class PrakThree {

	public static void main(String args []) {
		String surname = " ";
		int percentage = 0 ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Supply the surname of the student: " + surname);
		surname = input.next();
		
		System.out.printf("Supply the percentage grade of the student: " + percentage);
		percentage = input.nextInt();
		
		if(percentage >= 80) {
			System.out.println(surname + "\t\tA - Distinction!");
		} else if(percentage >=70 && percentage<80) {
			System.out.println(surname + "\t\tB - Pass");
		} else if(percentage >=60 && percentage<70) {
			System.out.println(surname + "\t\tC - Pass");
		} else if(percentage >=50 && percentage<60) {
			System.out.println(surname + "\t\tD - Pass");
		} else if(percentage >=45 && percentage<50) {
			System.out.println(surname + "\t\tRe-write opportunity");
		} else if(percentage>=40 && percentage<50) {
			System.out.println(surname + "\t\tE - Fail");
		} else if(percentage>=30 && percentage<40) {
			System.out.println(surname + "\t\tF - Fail");
		} else {
			System.out.println(surname + "\t\tG - Fail");
		}
	}
}