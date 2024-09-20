package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {
	static int[] steps;
	static Integer[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		steps = new int[N + 1];
		dp = new Integer[N + 1];
		for(int i = 1; i <= N; i++) {
			steps[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = steps[0];
		dp[1] = steps[1];
		
		if(N >= 2) {
			dp[2] = steps[1] + steps[2];
		}
		System.out.println(recur(N));
	}
	
	public static int recur(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(recur(n - 2), recur(n - 3) + steps[n - 1]) + steps[n];
		}
		return dp[n];
		
	}
}
