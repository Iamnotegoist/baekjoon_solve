import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1010 {
	
	private static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			sb.append(combination(m, n)).append('\n');
		}
		
		
		System.out.println(sb);
	}
	
	public static int combination(int n, int m) {
		if(dp[n][m] > 0) {
			return dp[n][m]; 
		}
		
		if(n == m || m == 0) {
			return dp[n][m] = 1;
		}
		
		return dp[n][m] = combination(n - 1, m - 1) + combination(n - 1, m);
	}
	
}
