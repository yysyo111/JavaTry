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
		System.out.println("現在の武器は" + h1.sword.name);
	}
}
