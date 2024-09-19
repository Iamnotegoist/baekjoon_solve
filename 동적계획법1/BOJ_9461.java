package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_9461 {
	static long dp[] = new long[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i = 4; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(triangle(N)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static long triangle(int n) {
		if(dp[n] == -1) {
			return dp[n] = triangle(n - 3) + triangle(n - 2);
		}
		return dp[n];
	}
}
