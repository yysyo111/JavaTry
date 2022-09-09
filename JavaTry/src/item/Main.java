package item;

public class Main {
	public static void main(String[] args) {
		Weapon w = new Weapon();
		System.out.println(w.name);
		System.out.println(w.price);
		System.out.println(w.name + "は" + w.price + "円です");
	}
}
