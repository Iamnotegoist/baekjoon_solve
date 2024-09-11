package Á¤·Ä;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_13241 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long N = Integer.parseInt(st.nextToken());
		long M = Integer.parseInt(st.nextToken());
		
		System.out.println(N * M / gcd(N, M));
		
	}
	
	static long gcd(long n, long m) {
		if(m == 0) {
			return n;
		}
		
		return gcd(m, n % m);
	}
}
