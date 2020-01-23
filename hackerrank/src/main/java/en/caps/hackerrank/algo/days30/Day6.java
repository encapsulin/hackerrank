package en.caps.hackerrank.algo.days30;

import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = -1;
		while(scan.hasNext()) {
			String s = scan.nextLine();
			if(n == -1) {
				n=0;
				continue;
			}
			
			
			String sEven = "";
			String sOdd = "";
			for(int i=0; i<s.length();i++) {
				if(i%2 == 0)
					sEven += s.substring(i,i+1);
				else
					sOdd += s.substring(i,i+1);
			}
			System.out.printf("%s %s %n",sEven, sOdd);
		}
	}

}
