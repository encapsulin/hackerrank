package en.caps.hackerrank.java;

import java.util.Arrays;

public class BigDecimal {

	public static void main(String[] args) {
		// String[] str = { "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34",
		// "000.000",null,null };
		String[] s = { "10", "123", "45", "766", "324324", ".324", "0.325", "-234", "4546", "100", "0" };
		System.out.println(Arrays.toString(s));
		// Arrays.sort(str);
		// Arrays.sort(str,(o1,o2)->{return Double.parseDouble(o1) <
		// Double.parseDouble(o2);});
//		return Double.valueOf(o2).toString().compareTo(Double.valueOf(o1).toString());
		Arrays.sort(s, (o1, o2) -> {
			if (o1 != null && o2 != null) {
				if (Double.valueOf(o1) > Double.valueOf(o2))
					return -1;
				else if (Double.valueOf(o1) < Double.valueOf(o2))
					return 1;
				return 0;
			}
			return 0;
		});
		System.out.println(Arrays.toString(s));
	}

}
