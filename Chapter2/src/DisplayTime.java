import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Prompt the user for input
		System.out.print("Enter an Integer for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60; // Find minutes in Seconds
		int remainingSeconds = seconds % 60; //Seconds Remaining
		input.close(); // Close Scanner
		System.out.println(seconds + " seconds is " + minutes +
				" minutes and " + remainingSeconds + " seconds");
	}

}
