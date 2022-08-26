package practice;

public class Main01 {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero01 h1 = new Hero01();
		h1.name = "ミナト";
		h1.hp = 100;
		h1.sword = s;
		Hero01 h2 = new Hero01();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard01 w1 = new Wizard01();
		w1.name = "スガワラ";
		w1.hp = 50;
		w1.heal(h1);
		w1.heal(h2);
		w1.heal(h2);
		System.out.println("現在の武器は" + h1.sword.name);
		h1.attack();
	}
}
