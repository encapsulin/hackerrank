package en.caps.hackerrank.days30;

import java.util.Scanner;

public class Day16Exceptions {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String s = in.next();
	        try{
	            int i = Integer.parseInt(s);
	            System.out.println(i);
	        }
	        catch (Exception e) {
	            System.out.println("Bad number");
	        }


	}

}
