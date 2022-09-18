package practice02;

public class Matango {
	int hp;
	final int LEVEL = 10;
	
	char suffix;
	public void run() {
		System.out.println("おばけきのこ" + this.suffix + "は逃げ出した");
	}
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero01 h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
