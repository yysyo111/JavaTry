package practice11;

import java.util.Arrays;

public class Main12 {
	public static void main(String[] args) {
//		int[] scores;
//		scores = new int[5];
		int[] scores = new int[5];
		scores[1] = 10;
		System.out.println(scores[0]);
		int num = scores.length;
		System.out.println("要素数" + num);
		int[] scores1 = new int[] {20, 30, 40, 50, 60};
		int[] scores2 = {20, 30, 40, 50, 60};
		System.out.println(scores1[2]);
		System.out.println(scores2[4]);
		
		int[] scores3 = new int[] {20, 30, 40, 50, 80};
//		for (int i = 0; i < scores3.length; i++) {
//			System.out.println(scores3[i]);
//		}
		Arrays.sort(scores3);
		for(int i = 0;i < scores3.length;i++) {
            System.out.print(scores3[i]);
            System.out.print(" ");
		}
	}
}
