package 스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class BOJ_10773 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		int n;
		
		for(int i = 0; i < K; i++) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) {
				stack.pop();
			} else {
				stack.add(n);
			}
		}
		
		Iterator<Integer> iterator = stack.iterator();
		
		int result = 0;
		while(iterator.hasNext()) {
			result += iterator.next();
		}
		
		System.out.println(result);
	}
}
