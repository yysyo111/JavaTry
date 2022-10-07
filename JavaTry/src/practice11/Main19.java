package practice11;

public class Main19 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("一桁の数値を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int n : numbers) {
			if (n == input) {
				System.out.println("あたり！");
			}
		}
	}
}
