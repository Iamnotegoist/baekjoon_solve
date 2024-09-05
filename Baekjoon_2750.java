import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2750 {
	private static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringBuilder sb = new StringBuilder();
		
		
		// 선택정렬에서 사용///////////
//		for(int i = 0; i < N; i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		selectionSort(arr);
//		for(int i: arr) {
//			sb.append(i).append("\n");
//		}
		///////////////////////////////
		
		// 범위는 -1000 ~ 1000
		boolean[] bArr = new boolean[2001];
		
		for(int i = 0; i < N; i++) {
			bArr[Integer.parseInt(br.readLine()) + 1000] = true;
		}
		
		for(int i = 0; i < 2001; i++) {
			if(bArr[i]) {
				sb.append(i - 1000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
	
	// 선택 정렬 - 성능 : O(n^2)
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
}
