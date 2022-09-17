package practice02;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();
		
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		Hero h2;
		h2 = h1;
		h2.hp = 200;
		System.out.println(h1.hp);
		
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		m1.run();
		m2.run();
		
	}
}
