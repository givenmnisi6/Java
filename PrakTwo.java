import java.util.*;

public class PrakTwo {

	public static void main(String args[]) {

		double circumference;
		double area;
		double volume;
		double diameter = 0;
		double radius;
		double height = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("CIRCUMFERENCE AND AREA OF A CIRCLE");

		System.out.printf("Enter the diameter (in cm): ");
		diameter = input.nextDouble();

		radius = diameter / 2;

		circumference = Math.round((2 * Math.PI * diameter / 2) * 100) / 100.0;
		area = Math.round(Math.PI * Math.pow(radius, 2) * 100) / 100.0;

		System.out.println("The circumference of a circle with diameter " + diameter + " is: " + circumference + " cm");
		System.out.println("The area of a circle with diameter " + diameter + " is: " + area + " square cm");

		System.out.println("VOLUME OF A CYLINDER");
		System.out.printf("Enter the height (in cm) of the cylinder: ");
		height = input.nextDouble();
		volume = Math.round((Math.PI * Math.pow(radius, 2) * height) * 100) / 100.0;

		System.out.println("The volume of a cylinder with a diameter " + (int) diameter +
				" and height " + (int) height + " is: " + volume + " cubic cm");
		System.out.println("Please press enter to quit the program");

	}
}