
public class Drive02 {
	public static void main(String[] args) {
		System.out.println("シナリオ①：車を場に登場させる----------");
		
//		インスタンス化
		Car02 chocoCar = new Car02();
		Car02 mocoCar = new Car02("クーペ", "モコ", "RED", 100, true);
		Car02 pochiCar = new Car02("トラック", "ポチ", "WHITE", 80, true);
		
		System.out.println("シナリオ②：車の情報(初期)の確認(mocoCarインスタンスの確認)----------");
		
		System.out.println("<mocoCar>");
		System.out.println("mocoCar.carModel:" + mocoCar.carModel);
		System.out.println("mocoCar.owner:" + mocoCar.owner);
		System.out.println("mocoCar.color:" + mocoCar.color);
		System.out.println("mocoCar.speed:" + mocoCar.speed);
		System.out.println("mocoCar.right:" + mocoCar.right);
		
		System.out.println("<chocoCarの情報>");
		System.out.println("chocoCar.carModel:" + chocoCar.carModel);
		System.out.println("chocoCar.owner:" + chocoCar.owner);
		System.out.println("chocoCar.color:" + chocoCar.color);
		System.out.println("chocoCar.speed:" + chocoCar.speed);
		System.out.println("chocoCar.right:" + chocoCar.right);
		
		System.out.println("<pochiCarの情報>");
		System.out.println("pochiCar.carModel:" + pochiCar.carModel);
		System.out.println("pochiCar.owner:" + pochiCar.owner);
		System.out.println("pochiCar.color:" + pochiCar.color);
		System.out.println("pochiCar.speed:" + pochiCar.speed);
		System.out.println("pochiCar.right:" + pochiCar.right);
		
		System.out.println("シナリオ③：車の情報(初期)の確認(chocoCarインスタンスのフィールドの確認()speedのみ)----------");
		
		System.out.println("<chocoCar>");
		System.out.println("chocoCar.speed" + chocoCar.speed);
		
		System.out.println("シナリオ④：メソッドの起動＆確認");
		
		chocoCar.accelerator();
		mocoCar.rightOff();
		pochiCar.brake();
		
		System.out.println("<mocoCar>");
		System.out.println("mocoCar.carModel:" + mocoCar.carModel);
		System.out.println("mocoCar.owner:" + mocoCar.owner);
		System.out.println("mocoCar.color:" + mocoCar.color);
		System.out.println("mocoCar.speed:" + mocoCar.speed);
		System.out.println("mocoCar.right:" + mocoCar.right);
		
		System.out.println("<chocoCarの情報>");
		System.out.println("chocoCar.carModel:" + chocoCar.carModel);
		System.out.println("chocoCar.owner:" + chocoCar.owner);
		System.out.println("chocoCar.color:" + chocoCar.color);
		System.out.println("chocoCar.speed:" + chocoCar.speed);
		System.out.println("chocoCar.right:" + chocoCar.right);
		
		System.out.println("<pochiCarの情報>");
		System.out.println("pochiCar.carModel:" + pochiCar.carModel);
		System.out.println("pochiCar.owner:" + pochiCar.owner);
		System.out.println("pochiCar.color:" + pochiCar.color);
		System.out.println("pochiCar.speed:" + pochiCar.speed);
		System.out.println("pochiCar.right:" + pochiCar.right);
	}
}
