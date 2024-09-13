package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_12789 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int order = 1;
		int x;
		Stack<Integer> stack = new Stack<Integer>();
		while(st.hasMoreTokens()) {
			x = Integer.parseInt(st.nextToken());
			if(order != x) {
				stack.push(x);
			} else {
				order++;
				/**
				 * 여기서 while문 대신 if문 쓰면 에러 발생함!
				 * 반례는 아래와 같다.
				 * 8
				 * 7 6 5 2 1 3 4 8
				 */
				while(!stack.isEmpty() && order == stack.peek()) {
					stack.pop();
					order++;
				}
			}
		}
		
		while(!stack.isEmpty()) {
			if(order != stack.pop()) {
				System.out.println("Sad");
				return;
			} else {
				order++;
			}
		}
		
		System.out.println("Nice");
	}
}
