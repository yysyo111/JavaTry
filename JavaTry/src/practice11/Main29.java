package practice11;

public class Main29 {
	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
//		int max = Math.max(x, y);
		if (x > y) {
			System.out.println("xはyより大きい");
		} else if(x < y) {
			System.out.println("xはyより小さい");
		} else {
			System.out.println("xはyは等しい");
		}
		
		if ((x % 2) == 0) {
			System.out.println("偶数です");
		} else if ((x % 2) == 1) {
			System.out.println("奇数です");
		}
		
		if ((x % 2) == 0) {
			if (x >= 0) {
				System.out.println("正の偶数");
			} else {
				System.out.println("負の数です");
			}	
		} else {
			if (x >= 0) {
				System.out.println("正の奇数");
			} else {
				System.out.println("負の奇数");
			}
		}
		
		int score = new java.util.Scanner(System.in).nextInt();
		if (score >= 60) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		if (score >= 80) {
			System.out.println("よくできました");
		} else if(score >= 50) {
			System.out.println("できました");
		} else {
			System.out.println("頑張りましょう");
		}
		
		if (score >= 80) {
			System.out.println("優");
		} if (score >= 60) {
			System.out.println("良");
		} if (score >= 40) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
		
		int score1 = new java.util.Scanner(System.in).nextInt();
		int score2 = new java.util.Scanner(System.in).nextInt();
		
		if (score1 >= 60 && score2 >= 60) {
			System.out.println("合格");
		} else if ((score1 + score2) >= 130) {
			System.out.println("合格");
		} else if ((score1 + score2) >= 100 && (score1 >=90 || score2 >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
	}
}
