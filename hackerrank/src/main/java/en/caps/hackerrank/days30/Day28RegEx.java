package en.caps.hackerrank.days30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegEx {

	static HashMap<String, String> hMap = new HashMap<>();
//	static ArrayList<HashMap<String,String>> aList = new ArrayList<>();
	static ArrayList<String> aList = new ArrayList<>();

	public static void main(String[] args) {
		 String Str = new String("Welcome to Tutorialspoint.com");
		System.out.println(Str.matches("(.*)Tutorials(.*)"));
		
		Str = new String("riya riya@gmail.com");
		System.out.println(Str.matches("(.*)@gmail.com$"));
		
		String[] firstNameEmailID = "riya riya@gmail.com".split(" ");

		String firstName = firstNameEmailID[0];

		String emailID = firstNameEmailID[1];

		if (emailID.trim().matches("(.*)@gmail.com$"))
			aList.add(firstName);
		
		Collections.sort(aList);
		System.out.println(aList.toString());		
	}

	public static void main1(String[] args) {
		parseLine("riya riya@gmail.com");
		parseLine("julia julia@julia.me");
		parseLine("julia sjulia@gmail.com");
		parseLine("julia julia@gmail.com");
		parseLine("samantha samantha@gmail.com");
		parseLine("tanya tanya@gmail.com");
		Collections.sort(aList);
		System.out.println(aList.toString());
	}

	static void parseLine(String sInput) {
		String sRegex = "(\\S+)\\s+\\S+@gmail.com";
		Pattern pat = Pattern.compile(sRegex);
		Matcher m = pat.matcher(sInput);
		if (m.find()) {
			//System.out.println(m.group(1));
			//System.out.println(m.group(2));
//			hMap.put("name", m.group(1));
//			hMap.put("email", m.group(2));
			aList.add(m.group(1));
		}
	}

}
