import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_25305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[10001];
		
		while(st.hasMoreTokens()) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		int cnt = 0;
		for(int i = 10000; i >= 0; i--) {
			if(arr[i] > 0) {
				cnt += arr[i];
			}
			
			if(cnt >= k) {
				System.out.println(i);
				break;
			}
		}
	}
}
