
public class Drive {
	public static void main(String[] args) {
		System.out.println("シナリオ①：車を場に登場させる----------");
		
		Car mocoCar = new Car();
		Car chocoCar = new Car();
		
		System.out.println("シナリオ②：車の情報(初期)の確認(mocoCarインスタンスの確認)----------");
		
		System.out.println("<mocoCar>");
		System.out.println("mocoCar.carModel:" + mocoCar.carModel);
		System.out.println("mocoCar.owner:" + mocoCar.owner);
		System.out.println("mocoCar.color:" + mocoCar.color);
		System.out.println("mocoCar.speed:" + mocoCar.speed);
		System.out.println("mocoCar.right:" + mocoCar.right);
		
		System.out.println("シナリオ③：車の情報(初期)の確認(chocoCarインスタンスのフィールドの確認()speedのみ)----------");
		
		System.out.println("<chocoCar>");
		System.out.println("chocoCar.speed" + chocoCar.speed);
		
		System.out.println("シナリオ④：acceleratorメソッドの起動＆確認");
		
		mocoCar.accelerator();
		System.out.println("<mocoCar>");
		System.out.println("mocoCar.carModel:" + mocoCar.carModel);
		System.out.println("mocoCar.owner:" + mocoCar.owner);
		System.out.println("mocoCar.color:" + mocoCar.color);
		System.out.println("mocoCar.speed:" + mocoCar.speed);
		System.out.println("mocoCar.right:" + mocoCar.right);
		
		System.out.println("<chocoCar>");
		System.out.println("chocoCar.speed" + chocoCar.speed);
	}
}

//driveは台本になる
