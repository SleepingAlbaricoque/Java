package sub02;

public class Test02Alternative {

	public static void main(String[] args) {
		
		System.out.println("12와 18의 최대공약수 : "+gcd(12, 18));
	}
	
	public static int gcd(int x, int y) {
		
		int a = Math.max(x, y);
		int b = Math.min(x, y);
		int c = b;
		
		
		while(true) {
				
			if(a % c == 0 && b % c == 0) {
					break;
			}
				c--;
				
		} return c;
	}
	
	
}
