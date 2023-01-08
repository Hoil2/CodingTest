// https://level.goorm.io/exam/159183/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EB%A8%BC%EB%8D%B0%EC%9D%B4-%EC%B5%9C%EC%9E%A5-%EB%A7%A8%ED%95%B4%ED%8A%BC-%EA%B1%B0%EB%A6%AC/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class The_longest_distance_to_Manhetton {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> numList = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		Collections.sort(numList);
		int result = Math.abs(numList.get(0) - numList.get(2)) + Math.abs(numList.get(1) - numList.get(3));
		
		System.out.println(result);
	}
}
