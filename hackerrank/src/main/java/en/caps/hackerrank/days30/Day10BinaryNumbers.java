package en.caps.hackerrank.days30;

public class Day10BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dec2bin(99999)); // 5
//		System.out.println(dec2bin(5));;// 101 1
		System.out.println(dec2bin(6));// 110 2
//		System.out.println(dec2bin(13));// 1101 2
	}

	public static int dec2bin(int dec) {
		String s = "";
		int iRemain = 0;
		int iConti = 0;
		int iContiMax = 0;
		while (dec > 1) {
			iRemain = dec % 2;
			if (iRemain == 1)
				iConti++;
			else {
				if(iContiMax < iConti)
					iContiMax = iConti;
				iConti = 0;
			}
			s += iRemain;
			dec /= 2;
		}
		iRemain = dec;
		if (iRemain == 1)
			iConti++;
		 {
			if(iContiMax < iConti)
				iContiMax = iConti;
			iConti = 0;
		}
		s += dec;
		// System.out.println(s);
		return iContiMax;
	}

}