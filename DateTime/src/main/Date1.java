package main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date1 {

	public static void main(String[] args) {

		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss:SSSSSS");
		String formatdatetime="Date:"+localdatetime.format(formatter);
		String formatdatetime2="Time:"+localdatetime.format(formatter2);
		System.out.println(formatdatetime);
		System.out.println(formatdatetime2);

	}

}
