package part11.exceptions;

public class Calculator {
	public int factorial(int num) {
		if(num >0) {
			int answer = 1;
	        for (int i = 1; i <= num; i++) {
	            answer *= i;
	        }
	        
	        return answer;
		}else
			throw new IllegalArgumentException("error factorial");
	}
	
	public int binomialCoefficient(int setSize, int subsetSize) {
		if(setSize >0 && subsetSize >0 && setSize >= subsetSize) {
			int numerator = factorial(setSize);
	        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

	        return numerator / denominator;
		}else
			throw new IllegalArgumentException("error factorial");
			
	}
}
