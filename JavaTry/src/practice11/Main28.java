package practice11;

public class Main28 {
	public static void main(String[] args) {
//		String s = new java.util.Scanner(System.in).nextLine();
//		System.out.println(s);
////		int n = Integer.parseInt(s);
////		System.out.println(n);
//		String s1 = new java.util.Scanner(System.in).nextLine();
//		int num = new java.util.Scanner(System.in).nextInt();
		
		int r = new java.util.Random().nextInt(90);
		System.out.println(r);
		
		int a = 5;
		int b = 7;
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println("大:" + max + "小:" + min);
		
		System.out.println("あなたの年齢は");
		int num1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("あなたが生まれてから、今までおよそ" + (num1 * 365) + "日です");
		
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		System.out.println("平均: " + (x + y) /2);
	}
}
