package practice02;

public class Hero01 {
	String name = "ミナト";
	int hp = 100;
	
	public Hero01() {
		System.out.println("Hero01のコンストラクタが作動");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ!");
		System.out.println("5のダメージ");
	}
}

//finalがついてるメソッド,は子クラスでオーバーライド禁止
//finalがついてるクラスは継承禁止