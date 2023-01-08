// https://level.goorm.io/exam/159664/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EB%A8%BC%EB%8D%B0%EC%9D%B4-%ED%95%A9%EA%B2%A9%EC%9E%90-%EC%B0%BE%EA%B8%B0/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Look_out_a_successful_applicant {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfExam = Integer.parseInt(br.readLine());
		for(int i = 0; i < numOfExam; i++) {
			int numOfApplicants = Integer.parseInt(br.readLine());
			int[] scores = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			
			double avg = 0;
			for(int score : scores) avg += score;
			avg /= (double)scores.length;

			int passCnt = 0;
			for(int score : scores) {
				if(score >= avg)  passCnt++;
			}

			System.out.println(passCnt + "/" + numOfApplicants);
		}
	}
}
