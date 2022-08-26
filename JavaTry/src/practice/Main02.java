package practice;

public class Main02 {
	public static void main(String[] args) {
		Thief th1 = new Thief("アサカ", 40, 5);
		System.out.println(th1.name);
		System.out.println(th1.hp);
		System.out.println(th1.mp);
		
		Thief th2 = new Thief("アサカ", 35);
		System.out.println(th2.name);
		System.out.println(th2.hp);
		th2.mp = 5;
		System.out.println(th2.mp);
		
		Thief th3= new Thief("アサカ");
		System.out.println(th3.name);
		System.out.println(th3.hp);
		System.out.println(th3.mp);
		
		Thief th4 = new Thief();
		th4.name = "アサカ";
		th4.hp = 40;
		th4.mp = 5;
		System.out.println(th4.name);
		System.out.println(th4.hp);
		System.out.println(th4.mp);
	}
}
