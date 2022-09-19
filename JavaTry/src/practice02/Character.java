package practice02;

public abstract class Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m);
}

//抽象クラスは、newによるインスタンス化が禁止(抽象クラスの制約)