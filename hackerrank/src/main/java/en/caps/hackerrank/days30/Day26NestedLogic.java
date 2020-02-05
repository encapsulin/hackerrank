package en.caps.hackerrank.days30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Day26NestedLogic {

	public static void main(String[] args) {
		int d1 = 31, m1 = 12, y1 = 2018;
		int d2 = 1, m2 = 1, y2 = 2019;
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//		String[] s1 = s.split("\\s");
//		d1 = Integer.parseInt(s1[0]);
//		m1 = Integer.parseInt(s1[1]);
//		y1 = Integer.parseInt(s1[2]);
//
//		s = scan.nextLine();
//		s1 = s.split("\\s");
//		d2 = Integer.parseInt(s1[0]);
//		m2 = Integer.parseInt(s1[1]);
//		y2 = Integer.parseInt(s1[2]);

		System.out.println(calcFee(d1, m1, y1, d2, m2, y2, true));
	}

	private static long calcFee(int d1, int m1, int y1, int d2, int m2, int y2, boolean d) {
		if(y1 > y2)
			return 10000;
		else if(y1 == y2 && m1>m2)
			return (m1-m2)*500;
		else if(m1 == m2 && d1 > d2)
			return (d1-d2)*15;
		return 0;		
	}
	
	private static long calcFee2(int d1, int m1, int y1, int d2, int m2, int y2, boolean d) {

//		LocalDate ld1 = LocalDate.of(y1, m1, d1);
//		LocalDate ld2 = LocalDate.of(y2, m2, d2);
//		Period p = Period.between(ld1, ld2);

//		long fee = 0;
//		if (m1 == m2 && y1 == y2) {
//			int diff = Math.abs(p.getDays());
//			fee = 15 * diff;
//		} else {
//			int diff = Math.abs(p.getMonths());
//			fee = 500 * diff;
//		}
////		System.out.println(fee);

		GregorianCalendar gcD1 = new GregorianCalendar(y1, m1, d1);
		GregorianCalendar gcD2 = new GregorianCalendar(y2, m2, d2);
		long fee = 0;

		if (m1 == m2 && y1 == y2) {
			long diff = gcD1.getTime().getTime() - gcD2.getTime().getTime();
			if (diff <= 0)
				return 0;
			long days = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
			if (d)
				System.out.println("Days: " + days);
			fee = 15 * days;
		} else if (y1 == y2) {
			int diff = gcD1.get(Calendar.MONTH) - gcD2.get(Calendar.MONTH);
			if (diff <= 0)
				return 0;
			if (d)
				System.out.println("diffMonth: " + diff);
			fee = 500 * (diff);
		} else {
			if (y1 < y2)
				return 0;
			fee = 10000;
		}
		if (d)
			System.out.println(fee);

		return fee;
	}

	public static void main1(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		String inputString1 = "23 01 1997";
		String inputString2 = "27 04 1997";
		try {
			Date date1 = myFormat.parse(inputString1);
			Date date2 = myFormat.parse(inputString2);
			long diff = date2.getTime() - date1.getTime();
			System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
