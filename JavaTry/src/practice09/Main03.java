package practice09;

public class Main03 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
//			バッファにJava追加
			sb.append("Java");
		}
//		完成した連結済みの文字列を取り出す
		String s = sb.toString();
		System.out.println(s);
	}
}
