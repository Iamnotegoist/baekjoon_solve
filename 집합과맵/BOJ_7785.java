package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_7785 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Set<String> set = new HashSet<String>();
		
		String name;
		String status;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			name = st.nextToken().toString();
			status = st.nextToken().toString();
			if(status.equals("enter")) {
				set.add(name);
			} else {
				set.remove(name);
			}
		}
		
		String[] arr = new String[set.size()];
		Iterator<String> iterator = set.iterator();
		int idx = 0;
		while(iterator.hasNext()) {
			arr[idx] = iterator.next();
			idx++;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append("\n");
		}
		
		System.out.println(sb);
	}
}
