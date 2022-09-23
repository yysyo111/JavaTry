package practice05;

import practice02.Sword;

public class Hero {
	private String name;
	int hp;
	
	Sword sword;
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
		this("ダミー");
	}
	
	public void attack() {
		System.out.println(this.name + "は攻撃した");
		System.out.println("敵に5ポイントのダメージを与えた");
//		System.out.println(this.name + "は" + sword.name + "で攻撃した！");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した!");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ポイント回復した");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ!");
		System.out.println("5のダメージ");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	private void die() {
		System.out.println(this.name + "は死んでしまった");
		System.out.println("GAME OVER です");
	}
}
