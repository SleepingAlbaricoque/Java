package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _03 {
	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int k = n;
		
		for(int i =0; i <k; i++) {
			n += i;
		}
		
		System.out.println(n);
	}
}
