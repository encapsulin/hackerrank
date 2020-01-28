package en.caps.hackerrank.interviewprep;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedString("abcac", 10));//4
		System.out.println(repeatedString("aba", 10));//7
		//abaabaabaaba 7
		System.out.println(repeatedString("a", 100000000000L));//1000000000000
	}

	static long repeatedString(String s, long n) {
		long cnt = 0;
				
		long lCharOccurInString = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'a')
            	lCharOccurInString++;
        }
                
		long lStringOccurInSeq = n/s.length();
		
		long tmpLen = lStringOccurInSeq * s.length();
		cnt = lStringOccurInSeq * lCharOccurInString;
		if(tmpLen < n) {
			for(int i=0;i<s.length() && tmpLen + i<n;i++)
				if(s.charAt(i) =='a')
					cnt++;
		}
		
			
		return cnt;
	}

    static long repeatedString_bad(String s, long n) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()<n) {
            sb.append(s);
        }
        long sum = 0;
        for(int i=0;i<n;i++) {
            if(sb.charAt(i) == 'a')
                sum++;
        }
        return sum;
    }
}
