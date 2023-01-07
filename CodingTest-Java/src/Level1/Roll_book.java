package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Roll_book {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		List<Human> humanList = new ArrayList<Human>();
		
		for(int i = 0; i < Integer.parseInt(input[0]); i++) {
			String[] humansInfo = br.readLine().split(" ");
			Human human = new Human();
			human.setName(humansInfo[0]);
			human.setHeight(Double.parseDouble((humansInfo[1])));
			humanList.add(human);
		}
		
		humanList.sort(Comparator.comparing(Human::getName)
				.thenComparing(Human::getHeight));
		
		System.out.println(humanList.get(Integer.parseInt(input[1])-1));
	}

	static class Human {
		private String name;
		private double height;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		@Override
		public String toString() {
			return String.format("%s %.2f",name, height);
		}
	}
}

