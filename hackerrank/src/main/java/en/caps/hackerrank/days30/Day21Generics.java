package en.caps.hackerrank.days30;

public class Day21Generics {

	public static void main(String[] args) {
		Printer<Integer> p = new Printer<>();
		p.printArray(new Integer[] {1,2,4,3});
		Printer<String> pS = new Printer<>();
		pS.printArray(new String[] {"asdf","qwer"});
		
	}

}

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    public void printArray(T[] arr){
        for(T i:arr)
        System.out.println(i);
    }

}