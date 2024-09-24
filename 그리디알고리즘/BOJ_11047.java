package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047 {
	static int N, K;
	static int[] coin;
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		
		for(int i = N - 1; i >= 0 ; i--) {
			if(K == 0) {
				break;
			}
			if(K / coin[i] > 0) {
				count += K / coin[i];
				K = K % coin[i];
			}
		}
		
		System.out.println(count);
	}
}
