package practice12;

import java.util.ArrayList;
import java.util.List;

public class Main04 {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		h.name = "スガワラ";
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).hp);
	}
}

class Hero {
	public String name;
	public int hp;
}
