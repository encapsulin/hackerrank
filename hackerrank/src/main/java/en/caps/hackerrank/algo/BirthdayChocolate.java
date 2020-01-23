package en.caps.hackerrank.algo;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(4);
		System.out.println(al);
		System.out.println(birthday(al, 4, 1));//2
		
		al = Arrays.asList(2, 2, 1, 3, 2);
		System.out.println(al);
		System.out.println(birthday(al, 4, 2));//2
	
		al = Arrays.asList(1, 2, 1, 3, 2);
		System.out.println(al);
		System.out.println(birthday(al, 3, 2));//2

		al = Arrays.asList(1, 1 ,1 ,1, 1 ,1);
		System.out.println(al);
		System.out.println(birthday(al, 3, 2));//2
	}

	static int birthday(List<Integer> s, int d, int m) {
		int r = 0;
		int i = 0;
		int iSize = s.size();
		for(int iV:s) {
			
			if(i+m <= iSize) {
				int sum = 0;
				int len = m;
				while(len-->0)
					sum += s.get(i+len);
				if(sum==d)
					r++;
			}

			i++;
		}
		return r;
	}

}
