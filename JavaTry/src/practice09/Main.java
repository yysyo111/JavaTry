package practice09;

public class Main {
	public static void main(String[] args) {
		String s1 = "スッキリ";
		String s2 = "Java";
		String s3 = "Java";
		if (s2.equals(s3)) {
			System.out.println("s2とs３はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1は空文字です");
		}
	}
}
