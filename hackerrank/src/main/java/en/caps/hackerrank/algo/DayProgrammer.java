package en.caps.hackerrank.algo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayProgrammer {

	public static void main(String[] args) {
//		for (int i =0; i <= 20; i++) {
//			System.out.println(i+": "+ dayOfProgrammer(1790+i));
//		}

		for (int i = 1920; i > 1790; i--) {
			System.out.println(i + ": " + dayOfYear(256, i));
		}

//		System.out.println(dayOfYear(59,1800));// 12.09.1800
//		System.out.println(dayOfYear(60,1800));// 12.09.1800
//		System.out.println(dayOfYear(61,1800));// 12.09.1800
//		
		System.out.println(dayOfProgrammer(1918));// 26.09.1918
//		System.out.println(dayOfProgrammer(1800));// 12.09.1800
//		System.out.println(dayOfProgrammer(1984));// 12.09.1984
//		System.out.println(dayOfProgrammer(2016));// 12.09.2016
//		System.out.println(dayOfProgrammer(2017));// 13.09.2017

//		System.out.println(dayOfProgrammer(1916));// 12.09.
//		System.out.println(dayOfProgrammer(1917));// 12.09.

//		System.out.println(dayOfProgrammer(1919));// 12.09.
//		System.out.println(dayOfProgrammer(1920));// 12.09.
//		System.out.println(dayOfProgrammer(1984));// 12.09.1984

	}

	public static String dayOfProgrammer(int year) {
		return dayOfYear(256, year);
	}
	public static String dayOfYear(int day, int year) {
		String r = "13";
		int leap = 0;

		if (year < 1918 && (year % 4) == 0) {// julian
			r = "12";
		} else if (year == 1918)
			r = "26";
		else if ((year % 400 == 0 || year % 4 == 0 && year % 100 != 0))
			r = "12";

		return r + ".09." + year;
	}
//	public static String dayOfYear(int day, int year) {
//		String r = "";
//		int leap = 0;
//
//		if (year < 1918 && (year % 4) == 0) {// julian
//			r = "26.09." + year;
//		}
//
//		if (year == 1918)
//			leap = -13;
////		else if ((year % 400 == 0 || year % 4 == 0 && year % 100 != 0))
////			leap = 1;
//
//		LocalDate ld = LocalDate.of(year, 1, 1);
//		ld = ld.plusDays(day - 1 - leap);
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//		r = dtf.format(ld);
//		return r.09." + year;
//	}


}
