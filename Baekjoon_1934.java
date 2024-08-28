import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Baekjoon_1934 {
	static Set<Integer> set = new HashSet<Integer>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		set.add(1);
		
		for(int i = 0; i < T; i++) {
			int result = 1;
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			for(int j = 1; j <= A; j++) {
				if(A % j == 0) {
					set.add(j);
				}
			}
			
			for(int j = 1; j <= B; j++) {
				if(B % j == 0) { 
					set.add(j);
				}
			}
			
			Iterator<Integer> iterator = set.iterator();
			
			while(iterator.hasNext()) {
				result *= iterator.next();
			}
			
			sb.append(result + "\n");
		}
		System.out.println(sb);
	}
}
