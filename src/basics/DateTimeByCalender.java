package basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeByCalender {
	public static void main(String[] args) {
		// Creating a Calendar instance to get the current date and time
		Calendar cal = Calendar.getInstance();

		// Formatting the date in MM/dd/yyyy hh:mm:ss format
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

		// Printing the formatted current date and time
		System.out.println(sd.format(cal.getTime()));

		// Printing individual date and time components
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); // Prints the day of the month
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // Prints the week number in the month
		System.out.println(cal.get(Calendar.AM_PM)); // Prints 0 for AM, 1 for PM
		System.out.println(cal.get(Calendar.MINUTE)); // Prints the current minute
	}

}
