package Á¤·Ä;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_10809 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = br.readLine();
		char[] inputArr = inputStr.toCharArray();
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		
		int[] resultArr = new int[26];
		for(int k = 0; k < resultArr.length; k++) {
			resultArr[k] = -1;
		}
		
		for(int i = 0; i < inputArr.length; i++) {
			if(resultArr[alphabet.indexOf(inputArr[i])] == -1) {
				resultArr[alphabet.indexOf(inputArr[i])] = i; 
			}
		}
		for(int i = 0; i < resultArr.length; i++) {
			System.out.print(resultArr[i] + " ");
		}
		
		
	}
	

}
