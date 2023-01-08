// https://level.goorm.io/exam/159665/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EB%A8%BC%EB%8D%B0%EC%9D%B4-%EC%B2%A0%EC%9E%90-%EB%B6%84%EB%A6%AC-%EC%A7%91%ED%95%A9/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Spell_separation_set {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		String str = br.readLine();
		char nowC = str.charAt(0);
		int cnt = 1;
		for(int i = 0; i < length; i++) {
			char c = str.charAt(i);			
			if(nowC != c && c != ' ') cnt++;
			nowC = c;
		}
		
		System.out.println(cnt);
	}
}
