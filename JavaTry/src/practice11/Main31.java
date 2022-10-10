package practice11;

public class Main31 {
	public static void main(String[] args) {
		String s = "SPAM";
		for (int i = 0; i < 10; i++) {
			System.out.println(s);
		}
		
		for (int i1 = 1; i1 <= 9; i1++) {
			System.out.print( ( 3 * i1 ) + " " );
		}
		System.out.println("");
		int x = 1;
		for (int n = 1; n <= 8; n++) {
			x *= 2;
			System.out.print("2の" + n + "乗=" + x + " ");
		}
		
		int y = 1;
		for (int n = 2; n <= 7; n++) {
			y *= n;
			System.out.println(y);
		}
		
		
		int sum = 0;
		for (int i =0; i <10; i++) {
			int score = new java.util.Scanner(System.in).nextInt();
			int value = score;
			sum += value;
		}
		System.out.println("平均は" + (sum / 10));
		
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int score = new java.util.Scanner(System.in).nextInt();
			if (score == 1) {
				count++;
			}
		}
		System.out.println("かち" + count + "負け" + (10 - count));
		
		
	}
}
