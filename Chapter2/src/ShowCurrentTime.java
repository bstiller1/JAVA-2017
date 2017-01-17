
public class ShowCurrentTime {

	public static void main(String[] args) {
		// Obtain the total milliseconds since Jan 1, 1970 12:00
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since Jan 1, 1970 12:00
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total Minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour 
		long currentMinute = totalMinutes % 60;
		
		// Obtain total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		// Display results
		System.out.println("Current time is " + currentHour + ":" +
		currentMinute + ":" + currentSecond + " GMT");

	}

}
