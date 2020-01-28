package en.caps.hackerrank.days30;

class Calculator {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		try {
			System.out.println(calc.power(-3, 5));
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	int power(int n, int p) throws Exception  {
		if(n<0 || p<0)
			throw new Exception("n and p should be non-negative");
		return (int)Math.pow(n, p);
	}
}
