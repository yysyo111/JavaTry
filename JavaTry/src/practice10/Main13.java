package practice10;

public class Main13 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			sb.append(i + 1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
		System.out.println(s);
		System.out.println(a[1]);
	}
}
