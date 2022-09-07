package inner_class_sample;

public class Outer {
	private static String greeting = "初めまして";

	public static class Inner {
		public String hello() {
			return greeting;
		}
	}
}
