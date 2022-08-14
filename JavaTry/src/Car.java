//クラス:モノの設計書
public class Car {
	
//	フィールド(クラスブロック直下で定義された変数) 属性(どんなものか)　フィールドとは、そのクラス(もの)の情報を表す
	String carModel = "クーペ"; //車種名
	String owner = "しょう"; //オーナー
	String color = "RED"; //色
	int speed = 0; //現在の速度
	boolean right = false; //ライト(true:点灯,false:消灯)
	
//	メソッド 機能(何が出来るか)
//	acceleratorメソッド (現在の速度を1km/h上げる)
	void accelerator() {
		speed++;
		System.out.println("(少し早くなった)");
	}
//	brakeメソッド (現在の速度を1km/h下げる)
	void brake() {
		speed--;
		System.out.println("(少し遅くなった)");
	}
	void rightOn() {
		right = true;
		System.out.println("(周囲が明るくなった)");
	}
	
	void rightOff() {
		right = true;
		System.out.println("(周囲が暗くなった)");
	}
	void klaxon() {
		System.out.println("「プップ〜〜〜〜〜〜ッ」");
	}
	
	
}

