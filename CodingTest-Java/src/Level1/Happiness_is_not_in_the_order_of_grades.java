// https://level.goorm.io/exam/147448/%EA%B8%B0%EB%B3%B8-%ED%96%89%EB%B3%B5%EC%9D%80-%EC%84%B1%EC%A0%81%EC%88%9C%EC%9D%B4-%EC%95%84%EB%8B%88%EC%9E%96%EC%95%84%EC%9A%94/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Happiness_is_not_in_the_order_of_grades {

	public static void main(String[] args) throws Exception {
		int result = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // 첫번째 줄 / 수업의 개수
		
		for(int i = 0; i < t; i++) {
			String[] _line = br.readLine().split(" "); // 과목만큼 입력받기
			List<Integer> line = Arrays.asList(_line).stream().mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()); // String to int, array to ArrayList
			
			int l = line.get(0); // 과목별 전체 학생 수
			int s = line.get(1); // 구름이의 등수
			int n = line.get(2); // 과목별 A+ 성적 순 비율
			int k = line.get(3); // 과목의 수행 평가 개수
			int m = line.get(4); // 과목의 수행 평가 과락 점수
			
			List<Integer> vList = line.subList(5, 5+k); // 구름이가 받은 수행 평가 점수들
			
			double per = (double)s / (double)l * 100; // 구름이의 백분율
			
			if(per >= n || vList.stream().filter(v -> v <= m).count() != 0) {
				result = 0;
			}
		}
		
		System.out.println(result);
	}
}
