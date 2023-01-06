// https://level.goorm.io/exam/47883/%EB%8B%A8%EC%96%B4%EC%9D%98-%EA%B0%9C%EC%88%98-%EC%84%B8%EA%B8%B0/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Counting_the_number_of_words {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] words = br.readLine().split(" ");
		int count = (int) Arrays.asList(words).stream().filter(word -> Pattern.matches("^[a-zA-Z]+$", word)).count();
		
		System.out.println(count);
	}

}
