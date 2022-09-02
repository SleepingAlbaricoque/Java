package test2;

public class Test08Alternative {

	public static void main(String[] args) {
		
		System.out.println("3!= "+factorial(3));
	}
	
	public static int factorial(int i) {
		
		int j =1;
		
		for(int k=1; k<=i ; k++) {
			
			j *= k;
		}
		
		return j;
	}
}
