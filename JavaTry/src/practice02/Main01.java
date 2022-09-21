package practice02;

import practice04.Wizard;

public class Main01 {
	public static void main(String[] args) {
		Hero01 h = new Hero01();
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();
		Weapon w = new Weapon();
		PoisonMatango pm = new PoisonMatango('A');
		Wizard wd = new Wizard();
		wd.name = "アサカ";
		wd.attack(pm);
		wd.fireball(pm);
		Character c = new Wizard();
		Wizard w = (Wizard)c;
	}
}
