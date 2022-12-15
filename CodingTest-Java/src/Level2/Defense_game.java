// https://school.programmers.co.kr/learn/courses/30/lessons/142085

package Level2;

import java.util.ArrayList;
import java.util.List;

// 작성중
public class Defense_game {

	public static void main(String[] args) {

	}

	static List<List<Integer>> tList = new ArrayList<List<Integer>>();
	static int length = 0;
	
	static int solution(int n, int k, int[] enemy) {
		length = enemy.length;
		
		re(new ArrayList<Integer>(), 0);
		
		return 0;
	}
	
	static void re(ArrayList<Integer> list, int index) {
		re(list, index);
		if(index >= length) return;
		ArrayList<Integer> _list = new ArrayList<Integer>(list);
		
		_list.add(index);
		tList.add(_list);

		for (int i=index+1; i<length; i++) {
			re(_list, i);
		}
	}
}
