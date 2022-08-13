import java.util.Random;
import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		// キーボードの準備
		Scanner stdin = new Scanner(System.in);
		 
		int count = 0; // 入力した回数を格納する変数
		 
		// コンピュータの答えを作成
		int comAnswer = new Random().nextInt(100)+1;
		 
		while (true) {
			try { // ユーザの予想値をキーボードから入力
			count++; // 入力した回数を１加算
			System.out.println(count+"回目：予想値(１～１００）の入力");
			// キーボードから整数としてデータを読み込み変数に保存
			int userGuess = stdin.nextInt();
		 
		    // 答えと一致するかどうかのチェック
		    // 答えの方が予想値より小さい場合
		    if (comAnswer < userGuess) {
		    System.out.println("もっと小さな値です");
		    // 答えの方が予想値より大きい場合
		    } else if (comAnswer > userGuess) {
		    System.out.println("もっと大きな値です");
		    // 上記の条件以外(答えと予想値が等しい場合)
		    } else {
		    System.out.println("\n正解です!!");
		    break;  // 無限ルールの終了
		    }
	    	} catch (Exception e) {
	     	// 整数以外のデータが入力された場合
	     	System.out.println("【エラー】予想値は数値を入力してください");
	     	// 入力されたデータの除去
	    	stdin.next();
		    } 
		}
	}
}
