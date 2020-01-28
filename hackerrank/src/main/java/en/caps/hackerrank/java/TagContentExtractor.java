package en.caps.hackerrank.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

	public static void main(String[] args) {
		extract("<h1>Nayeem loves counseling</h1>");
		extract("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
		extract("<Amee>safat codes like a ninja</amee>");
//		extract("<SA premium>Imtiaz has a secret crush</SA premium>");
	}

	static void extract(String str) {
//		System.out.println(str);
		// String regex = "<(.+)>(.+)</\\1>";
		String regex = "<(.+)>(([^<>]+))</\\1>";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		// System.out.println(m.groupCount());
		boolean found = false;
		while (m.find()) {
//			System.out.println("m.group():" + m.group());
//			for (int i = 0; i < m.groupCount(); i++) {
//				System.out.printf("m.group(%d):%s\n", i, m.group(i));
//			}
			System.out.println(m.group(2));
			found = true;
		}
		if (!found)
			System.out.println("None");
	}
}
