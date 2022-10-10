package practice11;

import java.util.Scanner;

public class Dentaku {
	 public static void main(String[] args) {
	        Scanner scn = new Scanner(System.in);
	        double a, b, wa, sa, seki, sho;

	        // キーボードから2つの数値を入力する
	        System.out.print("1つ目の値を入力してください = ");
	        a = scn.nextDouble();
	        System.out.print("2つ目の値を入力してください = ");
	        b = scn.nextDouble();

	        // 2つの数値の四則演算を行う
	        wa = a + b;
	        sa = a - b;
	        seki = a * b;
	        sho = a / b;

	        // 演算結果を画面に表示する
	        System.out.println("加算結果 = " + wa);
	        System.out.println("減算結果 = " + sa);
	        System.out.println("乗算結果 = " + seki);
	        System.out.println("除算結果 = " + sho);
	    }
}
