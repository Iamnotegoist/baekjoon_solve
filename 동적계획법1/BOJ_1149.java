package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1149 {
	static int[][] cost;
	static Integer[][] dp;
	static final int red = 0;
	static final int green = 1;
	static final int blue = 2;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		cost = new int[N][3];
		dp = new Integer[N][3];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			cost[i][red] = Integer.parseInt(st.nextToken());
			cost[i][green] = Integer.parseInt(st.nextToken());
			cost[i][blue] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][red] = cost[0][red];
		dp[0][green] = cost[0][green];
		dp[0][blue] = cost[0][blue];
		
		recur(N - 1, red);
		recur(N - 1, green);
		recur(N - 1, blue);
		
		System.out.println(Math.min(dp[N - 1][red], Math.min(dp[N - 1][green], dp[N - 1][blue])));
	}
	
	public static int recur(int n, int color) {
		if(dp[n][color] == null) {
			if(color == red) {
				dp[n][red] = Math.min(recur(n-1, green), recur(n-1, blue)) + cost[n][red];
			} else if(color == green) {
				dp[n][green] = Math.min(recur(n-1, red), recur(n-1, blue)) + cost[n][green];
			} else if(color == blue) {
				dp[n][blue] = Math.min(recur(n-1, red), recur(n-1, green)) + cost[n][blue];
			}
			
		}
		return dp[n][color];
	}
}
