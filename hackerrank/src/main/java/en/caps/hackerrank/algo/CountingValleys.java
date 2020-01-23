package en.caps.hackerrank.algo;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countingValleys(0, "UDDDUDUU"));;

	}

	static int countingValleys(int n, String s) {
		int iCnt = 0;
		boolean sealevel = true;
		int currentLevel = 0;
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			System.out.println(c);
			if(c=='U') {
				if(currentLevel+1==0)
					iCnt++;
				currentLevel++;
			}			
			if(c=='D') {
				currentLevel--;
			}
			
		}
		return iCnt;
	}

}
