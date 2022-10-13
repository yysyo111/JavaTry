package practice12;

import java.util.ArrayList;

public class Collection01 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		System.out.println(points.size());
		System.out.println(points.isEmpty());
		System.out.println(points.remove(1));
		System.out.println(points.size());
		System.out.println(points.get(1));
 	}
}

//ArrayList<> 変数名 = new ArrayList<>();