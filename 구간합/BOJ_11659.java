package 구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11659 {
	static int N, M;
	static int[] sum;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		sum = new int[N + 1];
		sum[0] = 0;
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++) {
			if(i == 1) { 
				sum[i] = Integer.parseInt(st.nextToken());
			}
			else {
				sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		int a, b;
		for(int i = 0; i < M; i++) {		
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			sb.append(sum[b] - sum[a - 1]).append("\n");
		}
		
		System.out.println(sb);
	}
}
