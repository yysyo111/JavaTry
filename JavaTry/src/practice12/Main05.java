package practice12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main05 {
	public static void main(String[] args) {
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		
		for (Hero h : heroes) {
			System.out.println(h.getName());
		}
		
		Map<Hero, Integer> heroes01 = new HashMap<Hero, Integer>();
		heroes01.put(h1, 3);
		heroes01.put(h2, 17);
		for (Hero key : heroes01.keySet()) {
			int value = heroes01.get(key);
			System.out.println(key.getName() + "が倒した敵=" + value);
		}
	}
}
