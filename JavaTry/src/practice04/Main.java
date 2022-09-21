package practice04;

public class Main {
	public static void main(String[] args) {
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();
		
		X obj = new A();
		obj.a();
		Y y1 = new A();
		Y y2 = new B();
		
		y1.a();
		y2.a();
		
		Y[] array = new Y[2];
		array[0] = new A();
		array[1] = new B();
		for (Y y : array) {
			y.b();
		}
	}
}
