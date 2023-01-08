// https://level.goorm.io/exam/159184/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EB%A8%BC%EB%8D%B0%EC%9D%B4-%EC%86%8C%EC%88%98-%EC%B0%BE%EA%B8%B0/quiz/1

package level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Find_prime_numbers {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		int[] numbers = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		int sum = 0;
		
		for(int i = 1; i <= length; i++) {
			if(isPrime(i)) {
				sum += numbers[i-1];
			}
		}
		
		System.out.println(sum);
	}
	
	static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					return false;
				}
		}
		return true;
	}
}
