package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Output_a_cloud_size {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int[] ints = Arrays.asList(input).stream().mapToInt(Integer::parseInt).toArray();
		
		System.out.println(ints[0] * ints[1]);
	}
}
