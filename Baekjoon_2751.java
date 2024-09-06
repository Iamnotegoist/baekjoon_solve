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
		/**
		 * <첫 번째 방법>
		 * Collections.sort()를 사용하는 방법
		 * Collections.sort()는 Timsort(합병 + 삽입 정렬 알고리즘)
		 * 합병정렬(Merger Sort)의 시간 복잡도 -> O(nlogn) 최악, 최선 모두
		 * 삽입정렬(Insertion Sort)의 시간 복잡도 -> 최선: O(n), 최악 O(n^2)
		 * 합병정렬의 최악의 경우 + 삽입 정렬의 최선의 경우를 합성한 알고리즘이라고 할 수 있음
		 * 시간 복잡도 O(n) ~ O(nlogn)을 보장함
		 * primitive 배열 지원 x, List 계열의 자료구조를 사용해야 함
		 */
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
		
		/**
		 * <두 번째 방법>
		 * Counting Sort를 사용하는 방법
		 */
		// 범위 : -1,000,000 ~ 1,000,000
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
