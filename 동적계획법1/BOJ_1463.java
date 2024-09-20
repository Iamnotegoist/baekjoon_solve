package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {
	static Integer[] dp;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		dp = new Integer[X + 1];
		dp[0] = 0;
		dp[1] = 0;
		
		System.out.println(find(X));
	}
	
	public static int find(int X) {
		if(dp[X] == null) {
			if(X % 6 == 0) {
				dp[X] = Math.min(find(X - 1), Math.min(find(X / 3), find(X / 2))) + 1;
			}
			else if(X % 3 == 0) {
				dp[X] = Math.min(find(X / 3), find(X - 1)) + 1;
			}
			else if(X % 2 == 0) {
				dp[X] = Math.min(find(X / 2), find(X - 1)) + 1;
			}
			else {
				dp[X] = find(X - 1) + 1;
			}
		}
		
		return dp[X];
	}
}
