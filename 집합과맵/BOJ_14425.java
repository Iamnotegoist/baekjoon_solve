package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Set<String> setS = new HashSet<>();
		
		for(int i = 0; i < N; i++) {
			setS.add(br.readLine().toString());
		}
		
		int idx = 0;
		for(int i = 0; i < M; i++) {
			if(setS.contains(br.readLine().toString())) {
				idx++;
			}
		}
		
		System.out.println(idx);
	}
}
