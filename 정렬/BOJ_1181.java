package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine().toString();
		}
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2); 
				}
				else {
					return o1.length() - o2.length();
				}
			}
		});
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				sb.append(arr[i]).append("\n");
			}else if(!arr[i - 1].equals(arr[i])) {
				sb.append(arr[i]).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
