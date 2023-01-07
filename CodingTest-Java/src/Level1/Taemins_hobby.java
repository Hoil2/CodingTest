package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taemins_hobby {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long input = Integer.parseInt(br.readLine());
		long sum = (input * (input + 1) / 2) % 1000000007;
		sum = sum * sum % 1000000007;
		
		System.out.println(sum);
	}
}
