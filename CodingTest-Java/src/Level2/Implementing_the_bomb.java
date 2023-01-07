// https://level.goorm.io/exam/159666/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%EB%A8%BC%EB%8D%B0%EC%9D%B4-%ED%8F%AD%ED%83%84-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0/quiz/1

package level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Implementing_the_bomb {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int size = Integer.parseInt(input[0]);
		int numOfBomb = Integer.parseInt(input[1]);
		int sum = 0;
		
		
		for(int i = 0; i < numOfBomb; i++) {
			input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			sum += getTotalCount(x, y, size);
		}
		
		System.out.println(sum);
	}
	
	static int getTotalCount(int x, int y, int size) {
		int count = 0;
		for(int i = -1; i <= 1; i++) {
			for(int j = -1; j <= 1; j++) {
				if((i == -1 && j == -1) || (i == -1 && j == 1) || (i == 1 && j == -1) || (i == 1 && j == 1)) {
					continue;
				}
				if(x+j >= 1 && x+j <= size && y+i >= 1 && y+i <= size) {
					count++;
				}
			}
		}
		return count;
	}

}
