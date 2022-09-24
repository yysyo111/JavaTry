package practice05;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("");
		Wizard w = new Wizard();
		w.setName("ミナト");
		w.setMp(5);

		
		Wand wa = new Wand();
		wa.setName("名も無い杖");
		wa.setPower(100.0);
		
		w.setWand(wa);
		System.out.println(wa.getName() + "の攻撃力は" + wa.getPower() + "です");
	}
}
