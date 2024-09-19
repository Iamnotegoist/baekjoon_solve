package 동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1912 {
	static int[] arr;
	static Integer[] dp;
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		max = arr[0];
		
		maximum(n -1);
		
		for(int i = 0; i < dp.length; i++) {
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		
		System.out.println(max);
			
	}
	
	public static Integer maximum(int n) {
		if(dp[n] == null) {
			dp[n] = Math.max(maximum(n -1) + arr[n], arr[n]);
		}
		
		return dp[n];
	}
}
