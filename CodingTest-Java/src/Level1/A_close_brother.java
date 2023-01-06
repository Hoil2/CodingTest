// https://level.goorm.io/exam/49088/%EC%9D%98%EC%A2%8B%EC%9D%80-%ED%98%95%EC%A0%9C/quiz/1

package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class A_close_brother {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ");
		int jinwoosFood = Integer.parseInt(first[0]);
		int sunwoosFood = Integer.parseInt(first[1]);
		int daysNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < daysNum; i++) {
			if(i % 2 == 0) {
				int halfFood = jinwoosFood / 2;
				halfFood += jinwoosFood % 2 == 1 ? 1 : 0;
				
				sunwoosFood += halfFood;
				jinwoosFood -= halfFood;
			}
			else {
				int halfFood = sunwoosFood / 2;
				halfFood += sunwoosFood % 2 == 1 ? 1 : 0;
				
				jinwoosFood += halfFood;
				sunwoosFood -= halfFood;
			}
		}
		
		System.out.println(jinwoosFood + " " + sunwoosFood);
	}
}
