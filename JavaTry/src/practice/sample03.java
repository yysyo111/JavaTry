package practice;

public class sample03 {
	public static void main(String[] args) {
		String[] fruit = {"りんご", "バナナ", "ミカン", "メロン", "いちご" };
	    String[][] pet = {
	            { "いぬ", "ねこ", "うさぎ", "りす", "うま" },
	            { "錦鯉", "金魚", "めだか", "亀" },
	            { "インコ", "オウム", "ハト" },
	    };
		
	    for (String f : fruit) {
	        System.out.print(f + "\t");
	    }
		System.out.println();
	    System.out.println();
	    
	    for (String[] pArray : pet) {
	        for (String p : pArray) {
	            System.out.print(p + "\t");
	        }
	        System.out.println();
	    }
	}
}
