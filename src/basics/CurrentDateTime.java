package basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
	public static void main(String[] args) {
		// Creating a Date object to get the current date and time
		Date d = new Date();

		// Formatting the date in MM/dd/yyyy format
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

		// Formatting the date in MM/dd/yyyy hh:mm:ss format
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");

		// Printing the default date format (toString())
		System.out.println(d.toString());

		// Printing the formatted date (MM/dd/yyyy)
		System.out.println(sdf.format(d));

		// Printing the formatted date with time (MM/dd/yyyy hh:mm:ss)
		System.out.println(sd.format(d));
	}
}