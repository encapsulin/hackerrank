package en.caps.hackerrank.algo;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(4);
	}

	static void staircase(int n) {
		for(int i=1;i<=n;i++) {
			int sp = n-i;
			while(sp-->0)
				System.out.print(" ");
			int st = i;
			while(st-->0)
				System.out.print("#");
			System.out.println("");
		}

    }
}
