package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_14888 {
	static int[] arr;
	static int[] operator = new int[4];
	static final int plus = 0;
	static final int minus = 1;
	static final int multi = 2;
	static final int divide = 3;
	static int N;
	static int Max = Integer.MIN_VALUE;
	static int Min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(arr[0], 1);
		
		System.out.println(Max);
		System.out.println(Min);
	}
	
	public static void dfs(int num, int idx) {
		if(idx == N) {
			Max = Math.max(Max, num);
			Min = Math.min(Min, num);
			return;
		}
		for(int i = 0; i < 4; i++) {
			if(operator[i] > 0) {
				operator[i]--;

				switch(i) {
				
				case plus: dfs(num + arr[idx], idx + 1); break;
				case minus: dfs(num - arr[idx], idx + 1); break;
				case multi: dfs(num * arr[idx], idx + 1); break;
				case divide: dfs(num / arr[idx], idx + 1); break;
				
				}
				
				operator[i]++;
			}
		}
	}
}
