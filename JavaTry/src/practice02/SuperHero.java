package practice02;

public class SuperHero extends Hero01 {
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}
}
