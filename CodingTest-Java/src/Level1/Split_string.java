// https://school.programmers.co.kr/learn/courses/30/lessons/140108

package Level1;

public class Split_string {

	public static void main(String[] args) {
		System.out.println(solution("aaabbaccccabba"));
	}
	
	// my solution
    public static int solution(String s) {
        int answer = 0;
        int splitIndex = 0;
        
        for(int i = 0; i < s.length();) {
        	char c = s.charAt(i);
        	
        	int sameCnt = 0, diffCnt = 0;
        	for(int j = splitIndex; j < s.length(); j++) {
        		if(c == s.charAt(j)) sameCnt++;
        		else diffCnt++;
        		
        		if(sameCnt == diffCnt) {
        			splitIndex = j+1;
        			i = j+1;
        			answer++;
        			break;
	        	}
        	}
        	
        	if(s.length() - i == 1) {
        		answer++;
        		break;
        	}
        	else if(sameCnt != diffCnt){
        		i++;
        	}
        }
        
        return answer;
    }
    
    // best solution
    public static int best_solution(String s) {
        char prev = '1';
        int same = 0, different = 0, answer = 0;
        for (char c : s.toCharArray()) {
            if (prev == '1') {
                prev = c;
                same++;
                answer++;
            } else if (prev == c) {
                same++;
            } else {
                different++;
            }

            if (same == different) {
                prev = '1';
                same = 0; different = 0;
            }
        }

        return answer;
    }
}

