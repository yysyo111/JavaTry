package practice;

import java.util.Scanner;

public class sample01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a, b, wa, sa, seki, sho;
		
		System.out.println("1つ目の値を入力してください = ");
		a = scn.nextDouble();
		System.out.println("2つ目の値を入力してください = ");
		b = scn.nextDouble();
		
		wa = a + b;
        sa = a - b;
        seki = a * b;
        sho = a / b;
        
        System.out.println("加算結果 = " + wa);
        System.out.println("減算結果 = " + sa);
        System.out.println("乗算結果 = " + seki);
        System.out.println("除算結果 = " + sho);
	}
}
