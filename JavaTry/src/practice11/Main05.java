package practice11;

public class Main05 {
	public static void main(String[] args) {
		boolean tenki = true;
		if (tenki == true) {
			System.out.println("選択をします");
			System.out.println("散歩に行きます");
		} else {
			System.out.println("DVDをみます");
		}
		
		for (int i = 0; i < 10; i++ ) {
//			System.out.println("こんにちは");
			System.out.print("現在" + (i + 1) + "周目→");
		}
		
		for (int o = 24; o > 5; o-- ) {
			System.out.println(o + "数減った");
		}
	}
}


//if (str.equals("夕方")) {} 文字の比較「==」