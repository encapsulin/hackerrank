package en.caps.hackerrank.algo;

public class TimeConversion {
	public static String s3;

	public static void main(String[] args) {

		System.out.println("0123456789".substring(5, 10));
		String s2 = 1 + 2 + "3";
		System.out.println(s2);

		System.out.println(s3);
		// TODO Auto-generated method stub
//		timeConversion(03:09:23PM");
		System.out.println(timeConversion("13:09:23PM"));
		System.out.println(timeConversion("00:09:23AM"));
		System.out.println(timeConversion("00:09:23PM"));

		System.out.println(timeConversion("12:01:00AM"));
		System.out.println(timeConversion("12:00:00PM"));
	}

	static String timeConversion(String s) {
		String sr = "";
		if (s.length() == 10)
			sr = s.substring(2, 8);
		String h = s.substring(0, 2);
		int iH = Integer.parseInt(h);

		if (s.matches(".*AM")) {
			if (iH == 12)
				iH = 0;
		}
		if (s.matches(".*PM")) {
			if (iH == 12)
				iH = 12;
			else
				iH += 12;
			if (iH > 24)
				iH -= 24;
		}

		h = Integer.toString(iH, 10);
		if (h.length() == 1)
			h = "0" + h;
		sr = h + sr;
		return sr;
	}
}
