package practice07;

public class Main {
	public static void main(String[]args) {
//		Hero h1 = new Hero(); 
//		Hero h2 = new Hero(); 
		Hero.money = 100;
		System.out.println(Hero.money);
//		System.out.println(h1.money);
//		h1.money = 300;
//		System.out.println(h2.money);
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		System.out.println(h1.money);
	}
}

//静的フィールド(static)を用いれば、インスタンス間でフィールドを共有できる
//new(インスタンス生成していなくても利用できる)
//静的フィールドはクラス変数と呼ばれている