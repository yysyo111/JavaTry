package practice;

public class Hero01 {
	String name;
	int hp;
	Sword sword;
	public void attack() {
		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
		System.out.println("的に５ポイントのダメージを与えた！");
	}
	
	public Hero01(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero01() {
		this("ダミー");
	}
}
