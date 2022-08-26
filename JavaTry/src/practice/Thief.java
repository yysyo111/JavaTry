package practice;

public class Thief {
	String name;
	int hp;
	int mp;
	
	public Thief(String n, int h, int m ) {
		this.name = n;
		this.hp = h;
		this.mp = m;
	}
	
	public Thief(String n, int h) {
		this.name = n;
		this.hp = h;
	}
	
	public Thief(String n) {
		this(n, 40);
	}
	
	public Thief() {
	}
}
