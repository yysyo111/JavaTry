package practice12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main01 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");
		System.out.println("色は" + colors.size() + "種類");
		for (String s : colors) {
			System.out.println(s + "→");
		}
		
		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		words.add("elephant");
		for (String s : words) {
			System.out.print(s + "→");
		}
	}
}
