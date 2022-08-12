
public class For02 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int number : array) {
			System.out.println("For02 = " + number);
		}
	}
}

//拡張For文
//for (型 変数名：配列やコレクションの変数) {
//    ブロック(繰り返し処理)
//}