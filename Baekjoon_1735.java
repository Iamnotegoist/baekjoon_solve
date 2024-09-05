import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); 
		int B = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int C = Integer.parseInt(st.nextToken()); 
		int D = Integer.parseInt(st.nextToken());
		
		int N = A * C;
		int M = B * D;
		
		System.out.println(N / gcd(N, M) + " " + M / gcd(N, M));
	}
	
	public static int gcd(int n, int m) {
		if(m == 0) {
			return n;
		}
		
		return gcd(m, n % m);
	}
}
