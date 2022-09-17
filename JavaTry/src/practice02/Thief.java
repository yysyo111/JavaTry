package practice02;

public class Thief {
	String name;
	int hp;
	int mp;
	
	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public Thief(String name, int hp) {
//		this.name = name;
//		this.hp = hp;
//		this.mp = 10;
		this(name, hp, 5);
	}
	
	public Thief(String name) {
//		this.name = name;
//		this.hp = 40;
//		this.mp = 15;
		this(name, 40);
	}
}
