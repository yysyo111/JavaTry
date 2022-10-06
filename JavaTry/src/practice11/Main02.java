package practice11;

public class Main02 {
	public static void main(String[] args) {
//		二つの値を比較
		int a = 5;
		int b = 3;
		int m = Math.max(a, b);
		int n = Math.min(a, b);
		System.out.println("比較実験：" + a + "と" + b + "とで大きい方は" + m);
		System.out.println("比較実験：" + a + "と" + b + "とで小さい方は" + n);
		
//		文字列を数値に変換
		String age = "21";
		int v = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (v + 1) + "さいになりますね");
		
//		ランダムな数を生成する命令
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "サイですね");
		
//		キーボードから一行の入力を受け取る命令
		System.out.println("あなたの名前を入力してください");
		String s = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + input + "さいの" + s + "さん");
	} 
}
