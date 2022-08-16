
//クラス:モノの設計図
public class Car02 {
//	フィールド(クラスブロック直下で定義された変数) 属性(どんなものか)　フィールドとは、そのクラス(もの)の情報を表す
	String carModel; //車種名
	String owner; //オーナー
	String color; //色
	int speed; //現在の速度
	boolean right; //ライト(true:点灯,false:消灯)
//	変数宣言のみ値を入れていない(空箱)
	
	
//	コンストラクタ①(引数なし) chocoCarがインスタン化されると同時に動き出す
	Car02() {
		System.out.println("コンストラクタ①(引数なし)---------");
//		フィールドに代入
		carModel = "未登録"; //車種名
		owner = "未登録"; //オーナー
		color = "未登録"; //色
		speed = 0; //現在の速度
		right = false; //ライト(true:点灯,false:消灯)
		System.out.println("-------------------------------");
	}
//	コンストラクタ①(引数あり)
	Car02(String carModel, String owner, String color, int speed, boolean right) {
		this();
		System.out.println("コンストラクタ①(引数あり)---------");
		this.carModel = carModel; //車種名
		this.owner = owner; //オーナー
		this.color = color; //色
		this.speed = speed; //現在の速度
		this.right = right; //ライト(true:点灯,false:消灯)
		System.out.println("-------------------------------");
	}
	
	
//	メソッド 機能(何が出来るか、どんな機能を持っているか)
//	acceleratorメソッド (現在の速度を1km/h上げる)
	void accelerator() {
		speed++;
		System.out.println(owner + "の車：(少し早くなった)");
	}
//	brakeメソッド (現在の速度を1km/h下げる)
	void brake() {
		speed--;
		System.out.println(owner + "の車：(少し遅くなった)");
	}
	void rightOn() {
		right = true;
		System.out.println(owner + "の車：(周囲が明るくなった)");
	}
	
	void rightOff() {
		right = false;
		System.out.println(owner + "の車：(周囲が暗くなった)");
	}
	void klaxon() {
		System.out.println(owner + "の車：「プップ〜〜〜〜〜〜ッ」");
	}
}
