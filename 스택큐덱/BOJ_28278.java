package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_28278 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int order;
		int x;
		int top = -1;
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			order = Integer.parseInt(st.nextToken());
			if(order == 1) {
				x = Integer.parseInt(st.nextToken());
				top++;
				arr[top] = x;
			} else if(order == 2) {
				if(top != -1) {
					sb.append(arr[top]).append("\n");
					top--;
				} else {
					sb.append(top).append("\n");
				}
			} else if(order == 3) {
				sb.append(top + 1).append("\n");
			} else if(order == 4) {
				if(top == -1) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if(order == 5) {
				if(top != -1) {
					sb.append(arr[top]).append("\n");
				} else {
					sb.append(top).append("\n");
				}
			}
		}
		
		System.out.println(sb);
			
	}
}
