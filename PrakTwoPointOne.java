import java.util.Scanner;

public class PrakTwoPointOne {

	public static void main(String args[]) {
		double firstNumber = 0;
		double secondNumber = 0;

		Scanner input = new Scanner(System.in);
		System.out.printf("Supply the first number: ");
		firstNumber = input.nextDouble();

		System.out.printf("Supply the second number: ");
		secondNumber = input.nextDouble();

		double sum = firstNumber + secondNumber;
		System.out.println("\nThe sum of the two numbes, is: " + sum);

		double multiplication = firstNumber * secondNumber;
		System.out.println("The two numbers multiplied is: " + multiplication);

		double subtraction = secondNumber - firstNumber;
		System.out.println("The first number subtracted from the second, is: " + subtraction);

		double division = firstNumber / secondNumber;
		System.out.println("The two numbers divided is: " + division);

		double average = (firstNumber + secondNumber) / 2;
		System.out.println("The average of the two numbers, is: " + average);

		double modulus = firstNumber % secondNumber;
		System.out.println("The remainder if the first number is divided into the second, is: " + modulus);

		double power = Math.pow(secondNumber, firstNumber);
		System.out.println("The second numbe to the power of the first number is: " + power);
	}
}