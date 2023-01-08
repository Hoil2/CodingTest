// https://level.goorm.io/exam/159181/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%A8%BC%EB%8D%B0%EC%9D%B4-%EB%8F%99%EB%AA%85%EC%9D%B4%EC%9D%B8/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Different_people_with_the_same_name {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		List<String> nameList = new ArrayList<String>();
		for(int i = 0; i < Integer.parseInt(input[0]); i++) {
			  nameList.add(br.readLine());
		}
		long count = nameList.stream().filter(name -> name.indexOf(input[1]) != -1).count();
		
		System.out.println(count);
	}
}
