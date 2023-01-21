package step03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _04 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tk;
		
		int x = Integer.parseInt(reader.readLine());
		int n = Integer.parseInt(reader.readLine());
		int result =0;
		
		for(int i=0; i<n; i++) {
			tk = new StringTokenizer(reader.readLine(), " ");
			result += Integer.parseInt(tk.nextToken()) * Integer.parseInt(tk.nextToken());
		}
		
		if(result == x)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
