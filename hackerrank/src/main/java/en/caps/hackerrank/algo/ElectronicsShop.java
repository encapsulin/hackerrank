package en.caps.hackerrank.algo;

public class ElectronicsShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    	int sum = -1;
    	for(int iK:keyboards)
    		for(int iD:drives)
    		{
    			int tmp = iK+iD;
    			if(sum<tmp && tmp <=b)
    				sum = tmp;
    		}
       return sum;
    }
}
