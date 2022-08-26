package practice;

public class Wizard01 {
	String name;
	int hp;
	public void heal(Hero01 h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した!");
		System.out.println(h.name + "のHPは" + h.hp + "です");
	}
}
