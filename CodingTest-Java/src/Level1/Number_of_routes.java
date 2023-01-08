// https://level.goorm.io/exam/159177/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%A8%BC%EB%8D%B0%EC%9D%B4-%EA%B2%BD%EB%A1%9C%EC%9D%98-%EA%B0%9C%EC%88%98/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Number_of_routes {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int num = Integer.parseInt(br.readLine());
		int[] numOfbridges = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		long result = 1;
		for(int numOfBridge : numOfbridges) {
			result *= numOfBridge;
		}
		
		System.out.println(result);
	}
}
