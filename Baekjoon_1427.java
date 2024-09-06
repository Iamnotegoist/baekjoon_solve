import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Baekjoon_1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] splitter = br.readLine().split("");
		List<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < splitter.length; i++) {
			list.add(Integer.parseInt(splitter[i]));
		}
		
		
		Collections.sort(list, Collections.reverseOrder());
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			sb.append(iterator.next());
		}
		
		System.out.println(sb);
		
	}
}
