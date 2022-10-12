package practice12;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
//		ArrayList
//		ArrayList<String> ジェネリクス
//		コレクションクラス:インスタンスではないものは格納できない
		ArrayList<String> names = new ArrayList<String>();
		names.add("田中");
		names.add("鈴木");
		names.add("斉藤");
		
		System.out.println(names.get(1));
		
//		配列
		String[] names1 = new String[3];
		names1[0] = "田中";
		names1[1] = "鈴木";
		names1[2] = "斉藤";
		
		System.out.println(names1[1]);
	}
}

