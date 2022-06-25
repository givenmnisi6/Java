import java.util.Scanner;
public class BMICalculator {

	public static void main(String args[]) {
		double weight, height;
		int choice;
		double BMI = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BMI Calculator!");
		
		System.out.println("\n1. Weight in kilograms, height in meters");
		System.out.println("2. Weight in pounds, height in inches ");
		
		System.out.printf("\nIndicate your choice: ");
		choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.printf("Enter your weight in kg: ");
			weight = sc.nextDouble();
		
			System.out.printf("Enter your height in m: ");
			height = sc.nextDouble();
			
			BMI = Math.round((weight/(Math.pow(height,2)))*100)/100.0;
			System.out.println("\nBMI Report");
			System.out.println("Weight:  " + weight + " kg");
			System.out.println("Height:  " + height + " m");
			System.out.println("BMI:     " + BMI);

		} else if(choice == 2)  {
			System.out.printf("Enter your weight in pounds: ");
			weight = sc.nextDouble();
		
			System.out.printf("Enter your height inches: ");
			height = sc.nextDouble();		
			
			BMI = Math.round(weight/Math.pow(height,2) * 703 * 100)/100.0;
			System.out.println("\nBMI Report");
			System.out.println("Weight:  " + weight + " lb");
			System.out.println("Height:  " + height + " in");
			System.out.println("BMI:     " + BMI);
			
		} else {
			System.out.println("Please select either choice 1 or 2");
		}	
		
			if(BMI >= 35) {
				System.out.println("Status:  Severely obese");
			} else if (BMI > 30 && BMI < 35) {
				System.out.println("Status:  Obese");
			} else if (BMI > 25 && BMI < 30) {
				System.out.println("Status:  Overweight");
			} else if (BMI > 18.5 && BMI < 25) {
				System.out.println("Status:  Healthy");		
			} else {
				System.out.println("Status:  Underweight");
			}
	}
}