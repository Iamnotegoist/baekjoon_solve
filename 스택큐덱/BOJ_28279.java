package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_28279 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int order;
		int x = 0;
		List<Integer> dequeue = new LinkedList<>(); 
		Iterator<Integer> iterator;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			order = Integer.parseInt(st.nextToken());
			if(st.hasMoreTokens()) {
				x = Integer.parseInt(st.nextToken());
			}
			
			if(order == 1) {
				dequeue.add(0, x);
			} else if(order == 2) {
				dequeue.add(x);
			} else if(order == 3) {
				if(!dequeue.isEmpty()) {
					sb.append(dequeue.get(0)).append("\n");
					dequeue.remove(0);
				} else {
					sb.append(-1).append("\n");
				}
			} else if(order == 4) {
				if(!dequeue.isEmpty()) {
					sb.append(dequeue.get(dequeue.size() - 1)).append("\n");
					dequeue.remove(dequeue.size() - 1);
				} else {
					sb.append(-1).append("\n");
				}
			} else if(order == 5) {
				sb.append(dequeue.size()).append("\n");
			} else if(order == 6) {
				if(dequeue.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if(order == 7) {
				if(!dequeue.isEmpty()) {
					sb.append(dequeue.get(0)).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			} else if(order == 8) {
				if(!dequeue.isEmpty()) {
					sb.append(dequeue.get(dequeue.size() - 1)).append("\n");
				} else {
					sb.append(-1).append("\n");
				}
			}
		}
		
		
		System.out.println(sb);
	}
}
