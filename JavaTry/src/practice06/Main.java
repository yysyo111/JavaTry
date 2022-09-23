package practice06;

public class Main {
	public static void main(String[] args) {
//		Empty e = new Empty();
//		String s = e.toString();
//		System.out.println(s);
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 =  "こんにちは";
	}
	public void printAnything(Object o) {
		System.out.println(o.toString());
	}
}
