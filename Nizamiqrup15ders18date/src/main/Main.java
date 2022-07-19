package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println("Local Date Time: " +localdatetime);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formatter1string  =localdatetime.format(formatter1);
		System.out.println("Date: " + formatter1string);
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm:ss:SSSSSS");
		String formatter2string  =localdatetime.format(formatter2);
		System.out.println("Time: " + formatter2string);
		
	}

}
