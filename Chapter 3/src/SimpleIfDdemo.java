import java.util.Scanner;

public class SimpleIfDdemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int number = input.nextInt();
		// Close Scanner input
		input.close();
		if(number % 5 == 0){
			System.out.println("High Five");
		}
		if(number % 2 == 0){
			System.out.println("Hi Even");
		}	
	} // end main method
} // end class
