package practice09;

public class Main05 {
	public static void main(String[] args) {
		String s = "abc,def,ghi";
		
//		String[] words = s.split("[,:]");
//		for (String w : words) {
//			System.out.println(w + "->");
//		}
		String w = s.replaceAll("[beh]", "X");
		String a = s.replaceAll("[adg]", "Z");
		System.out.println(w);
		System.out.println(a);
		
	}
}
