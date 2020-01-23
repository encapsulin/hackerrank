package en.caps.hackerrank.days30;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionariesMaps {

	public static void main(String[] argh) {

		Map<String, Integer> mPhones = new HashMap<>();

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			mPhones.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			if (mPhones.containsKey(s))
				System.out.println(mPhones.get(s));
			else
				System.out.println("Not found");
		}
		in.close();
	}

}
