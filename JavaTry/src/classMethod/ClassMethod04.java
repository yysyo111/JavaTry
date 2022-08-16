package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		Human04 sato = new Human04("佐藤");
		Human04 tanaka = new Human04("田中");
		
		Human04.staticMetodPrint();
		
		yamada.instanceMethodPrint();
		System.out.println(yamada.name + "です" + Human04.GREETING);
		sato.instanceMethodPrint();
		System.out.println(sato.name + "です" + Human04.GREETING);
		tanaka.instanceMethodPrint();
		System.out.println(tanaka.name + "です" + Human04.GREETING);
	}
}
