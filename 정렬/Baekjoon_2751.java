package 정렬;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Baekjoon_2751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		//*******************************************************************//
//		List<Integer> list = new ArrayList<Integer>();
//		
//		for(int i = 0; i < N; i++) {
//			list.add(Integer.parseInt(br.readLine()));
//		}
//		
//		Collections.sort(list);
//		
//		
//		Iterator<Integer> iterator = list.iterator();
//		
//		while(iterator.hasNext()) {
//			sb.append(iterator.next()).append("\n");
//		}
//		
//		System.out.println(sb);
		
		//*******************************************************************//
		
		boolean[] arr = new boolean[2_000_001];
		for(int i = 0; i < N; i ++) {
			arr[Integer.parseInt(br.readLine()) + 1_000_000] = true;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				sb.append((i - 1_000_000)).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
