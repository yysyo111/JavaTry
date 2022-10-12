package practice12;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("田中");
		names.add("鈴木");
		names.add("斉藤");
		
		System.out.println(names.get(1));
	}
}
