package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24416 {
	static int[] f;
	static int count1;
	static int count2;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		f = new int[n + 1];
		StringBuilder sb = new StringBuilder();
		
		fibonacci(n);
		fibonacciDp(n);
		sb.append(count1).append(" ").append(count2);
		
		System.out.println(sb);
	}
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) {
			count1++;
			return 1;
		}
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int fibonacciDp(int n) {
		f[1] = f[2] = 1;
		for(int i = 3; i <= n; i++) {
			count2++;
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}
}
