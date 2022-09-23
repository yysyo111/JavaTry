package practice05;

public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "剣";
		Hero h = new Hero();
		h.run();
		Wizard w = new Wizard();
		w.heal(h);
	}
}
