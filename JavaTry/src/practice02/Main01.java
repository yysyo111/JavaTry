package practice02;

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
	}
}
