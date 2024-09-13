package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_24511 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] qs = new int[N];
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			qs[i] = Integer.parseInt(st.nextToken());
		}
				
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i = N; i > 0; i--) {
			if(qs[i - 1] == 0) {
				queue.add(arr[i - 1]);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			queue.add(Integer.parseInt(st.nextToken()));
			sb.append(queue.poll()).append(" ");
		}
		
		System.out.println(sb);
		
//		int rtn = 0;
//		int x;
//		int temp;
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < M; i++) {
//			x = Integer.parseInt(st.nextToken());
//			for(int j = 0; j < N; j++) {
//				if(j == 0) {
//					if(qs[j] == 0) { //큐일 때
//						rtn = arr[j];
//						arr[j] = x;
//					} else {         //스택일 때
//						rtn = x;
//					}
//				} else {
//					if(qs[j] == 0) { //큐일 때
//						temp = arr[j];
//						arr[j] = rtn;
//						rtn = temp;
//					} else {         //스택일 때
//						rtn = rtn;
//					}
//					
//				}
//			}
//			sb.append(rtn).append(" ");
//		}
//		
//		System.out.println(sb);
	}
}
