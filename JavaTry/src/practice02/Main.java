package practice02;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero("ミナト");
		h.sword = s;
		System.out.println(h.hp);
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();
		
		Thief t1 = new Thief("アサカ", 40, 5);
		System.out.println(t1.name + t1.hp + t1.mp);
		
		Thief t2 = new Thief("アサカ", 35);
		System.out.println(t2.name + t2.hp + t2.mp);
		
		Thief t3 = new Thief("アサカ");
		System.out.println(t3.name + t3.hp + t3.mp);
		
		Hero h1 = new Hero();
		h1.hp = 100;
		Hero h2 = new Hero("アサカ");
		h2.hp = 100;
		Wizard w = new Wizard();
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
		
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//		
//		
//		Matango m2 = new Matango();
//		m2.hp = 48;
//		m2.suffix = 'B';
//		
//		m1.run();
//		m2.run();
//		
	}
}
