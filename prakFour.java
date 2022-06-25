import java.util.Scanner;

public class prakFour {
	
	public static void main(String args[]) {
		double side = 0;
		double diagonal;
		double perimeter;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Square");
		System.out.printf("Enter one side of a square (in meters): ");
		side = sc.nextDouble();
		
		diagonal = Math.round((Math.sqrt(2) * side)*100)/100.0;
		perimeter = 4 * side;
		
		if(side > 0) {
			System.out.println("The diagonal of the square: " + diagonal);
			System.out.println("The perimeter of the square: "+ perimeter);
		} else {
			System.out.println("We cannot calculate for a negative side");
		}
		
		System.out.println("\n--------------------------------------------------------------------------");
	 	System.out.println("Right triangle");
		double longestSide = 0;
		double side2 = 0;
		double side3 = 0;
			
		System.out.printf("Enter the longest side of the rectangle (in meters): ");
		longestSide = sc.nextDouble();
		
		System.out.printf("Enter the second side of the rectangle (in meters): ");
		side2 = sc.nextDouble();
		
		System.out.printf("Enter the third side of a rectangle (in meters): ");
		side3 = sc.nextDouble();
		
		if(longestSide == (Math.sqrt(Math.pow(side2,2) + (Math.pow(side3,2))))) {
			System.out.println("It is a right triangle!");
		} else {
			System.out.println("It is not right triangle");
		}
	}
}
