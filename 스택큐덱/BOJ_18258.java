package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18258 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		String order;
		int x = 0;
		int front = 0;
		int end = 0;
		int[] arr = new int[N];
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			order = st.nextToken().toString();
			if(st.hasMoreTokens()) {
				x = Integer.parseInt(st.nextToken());
			}
			
			if(order.equals("push")) {
				arr[end] = x;
				end++;
			} else if(order.equals("pop")) {
				if(end - front == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(arr[front]).append("\n");
					front++;
				}
			} else if(order.equals("size")) {
				sb.append(end - front).append("\n");
			} else if(order.equals("empty")) {
				if((end - front) == 0) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if(order.equals("front")) {
				if(end - front == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(arr[front]).append("\n");
				}
			} else if(order.equals("back")) {
				if(end - front == 0) {
					sb.append(-1).append("\n");
				} else {
					sb.append(arr[end - 1]).append("\n");
				}
			}
		}
		
		System.out.println(sb);
	}
}
