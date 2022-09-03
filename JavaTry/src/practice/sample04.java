package practice;

import java.util.Scanner;

public class sample04 {
	public static double daikei(double joutei, double katei, double takasa) {
		double menseki;
		menseki = (joutei + katei) * takasa / 2.0;
		
		return menseki;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a, b, c, ans;
		
		System.out.print("上底を入力してください = ");
		a = scn.nextDouble();
		System.out.print("下底を入力してください = ");
	    b = scn.nextDouble();
	    System.out.print("高さを入力してください = ");
	    c = scn.nextDouble();
	    
	    ans = daikei(a, b, c);
	    System.out.println("面積 = " + ans);
	}
}
