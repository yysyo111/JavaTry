package practice06;

public class Main {
	public static void main(String[] args) {
//		Empty e = new Empty();
//		String s = e.toString();
//		System.out.println(s);
		Object o1 = new Empty();
		Object o2 = new Hero();
		Object o3 =  "こんにちは";
		
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h.toString());
		System.out.println(h);
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "ミナト";
		h2.hp = 100;
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}
//	public void printAnything(Object o) {
//		System.out.println(o.toString());
//	}
}

//等価(同一の存在であること):「==」の判定
//指しているものが「完全に同一の存在」であること(つまり同じアドレスを指している)
//等値(同じ内容であること):「equals」の判定
//指している2つのものが「同じ内容」であること(同じアドレスを指していなくても良い)
