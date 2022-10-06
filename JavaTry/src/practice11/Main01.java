package practice11;

public class Main01 { 
	public static void main(String[] args) {
		System.out.println("私の好きな記号は二重引用符 (\") です ");
		int a;
		int b;
		a = 22;
		b = a + 5;
		System.out.println(a);
		System.out.println(b);
		int c = 0b0011;
		System.out.println(c); //2進数(先頭に0b)
		int d = 0x11;
		System.out.println(d); //16進数(先頭に0x)
		
		int f ;
		f = 100;
		f++;
		System.out.println(f);
		
		byte g = 12;
		int h = g;
		System.out.println(h);
		
		int age = (int)3.2; //キャスト演算子 (変換先の型名)式
		System.out.println(age);
		
		String name = "菅原";
		System.out.print("私の名前は");
		System.out.print(name);
		
//		int i = 32;
//		byte j = i;
//		System.out.println(j);
	}	
}

//a,b,5 オペランド
//+ = 演算子
//バックスラッシュ(\)でリテラル表記
//代入演算子
//a += 2; (a = a + 2)