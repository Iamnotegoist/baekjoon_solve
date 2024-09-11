package 정렬;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		
		sb.append(gcd(N, M) + "\n");
		
		sb.append(N * M / gcd(N, M));
		
		System.out.println(sb);
	}
	
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
	
	public static int gcdByLoop(int a, int b) {
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
}
