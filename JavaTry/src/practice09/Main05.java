package practice09;

public class Main05 {
	public static void main(String[] args) {
		String s = "abc,def,ghi";
		
//		String[] words = s.split("[,:]");
//		for (String w : words) {
//			System.out.println(w + "->");
//		}
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
	}
}
