package practice11;

public class Main26 {
	public static void main(String[] args) {
		introduceOneself();
//		email("確認事項", "abcd@gmail", "みたら返信頼む");
//		String title = "確認事項";
		String address = "abcd@gmail";
		String text = "みたら返信頼む";
		email(address, text);
		
		double triangleArea = calcTriangleArea(10.0, 5.0);
		System.out.println("三角形の面積" + triangleArea + "平方センチメートル");
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積" + circleArea + "平方センチメートル");
		
	}
	public static void introduceOneself() {
		String name = "湊";
		int age = 21;
		double weight = 173.2;
		char a = '虎';
		System.out.println(name + age + weight + a);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：無題" );
		System.out.println("本文：" + text);
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double area = bottom * height / 2;
		return area;
	}
	
	public static double calcCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
