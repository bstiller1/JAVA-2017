import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		// close the scanner input
		input.close();
		
		// Compute area
		double area = radius * radius * 3.14159;
		
		//Display results
		System.out.println("The area for the circle of radius " +
		radius + " is " + area);

	}

}
