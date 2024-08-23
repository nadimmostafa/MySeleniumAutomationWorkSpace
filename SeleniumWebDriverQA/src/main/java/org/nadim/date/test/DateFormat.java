package org.nadim.date.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	public static void main(String[] args) {
		
		String date = "01-06-2024";
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(date,f);
		
		String valueOf = String.valueOf(localDate.getDayOfMonth());
		System.out.println(localDate.getMonth());
		System.out.println(valueOf);
		System.out.println(localDate.getYear());
		
		System.out.println(LocalDate.now().toString());

	}

}
