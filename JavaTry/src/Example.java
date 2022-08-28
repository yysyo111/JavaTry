import inner_class_sample.Human;
import inner_class_sample.Outer;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = new Outer.Inner(); 
		
		Human human = new Human();
		Human.Humanleg leg = human.new Humanleg();
		leg.kick();
	}
}
