// https://school.programmers.co.kr/learn/courses/30/lessons/142086

package Level1;

import java.util.Arrays;

public class The_nearest_identical_letter {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("banana")));
	}
        
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = i-1; j >= 0; j--) {
                if(s.charAt(j) == s.charAt(i)) {
                    answer[i] = i - j;
                    break;
                }
            }
            if(answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
