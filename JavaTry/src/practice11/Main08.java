package practice11;

import java.util.Random;

public class Main08 {
	 public static void main(String[] args) {
		 Random rnd = new Random();
		 int isHungry = 0;
		 String food = "コメ";
		 System.out.println("こんにちは");
		 if (isHungry == 0) {
		 	System.out.println("お腹がいっぱいです");
		 } else {
		 	System.out.println("腹ペコです");
		 	System.out.println(food + "を頂きます");
		 }
		 System.out.println("ご馳走様でした");
	 }
}
