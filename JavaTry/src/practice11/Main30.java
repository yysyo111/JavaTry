package practice11;

public class Main30 {
	public static void main(String[] args) {
		System.out.println("曜日を選択してください");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("時間帯を選択してください");
		System.out.print( "0=午前、1=午後、2=夜間" );
		int zone = new java.util.Scanner(System.in).nextInt();
		
		boolean bopen = true;
		
		if (day == 0) {
			bopen = false;
		} else if (zone == 0 && (day == 2 || day == 5)) {
			bopen = false;
		} else if (zone == 1 && day == 6 ) {
			bopen = false;
		} else if (zone == 2 && (day == 3 || day == 6)) {
			bopen = false;
		}
		
		if (bopen) {
			System.out.println( "診療しています。" );
		} else {
			System.out.println( "休診です。" );
		}
		
		System.out.println("何月ですか？");
		int month = new java.util.Scanner(System.in).nextInt();
		
		switch(month) {
		    case 1:
		    	System.out.println("元日" );
		        System.out.println("成人の日");
		        break;
		    case 2:
		    	System.out.println("建国記念の日");
		    	break;
		    case 3:
		    	System.out.println("春分の日");
		    	break;
		    case 4:
		        System.out.println("昭和の日");
		        break;
		    case 5:
		        System.out.println("憲法記念日");
		        System.out.println("みどりの日");
		        System.out.println("こどもの日");
		        break;
		    case 6:
		    case 7:
		        System.out.println("海の日");
		        break;
		    case 8:
		    case 9:
		        System.out.println("敬老の日");
		        System.out.println("秋分の日");
		        break;
		    case 10:
		        System.out.println("体育の日");
		        break;
		    case 11:
		        System.out.println("文化の日" );
		        System.out.println("勤労感謝の日");
		        break;
		    case 12:
		        System.out.println("天皇誕生日");
		        break;
		}
		
		System.out.println("好きな寿司を入れてください");
		System.out.println("1:まぐろ 2:えび 3:こはだ 4:あなご 5:いくら");
		
		int sushi = new java.util.Scanner(System.in).nextInt();
		
		switch(sushi) {
		    case 1:
		    	 System.out.println( "まぐろ" );
		    	 break;
		    case 2:
		    	 System.out.println( "えび" );
		    	 break;
		    case 3:
		    	 System.out.println( "こはだ" );
		    	 break;
		    case 4:
		    	 System.out.println( "あなご" );
		    	 break;
		    case 5:
		    	 System.out.println( "いくら" );
		    	 break;
		    default:
		         System.out.println("寿司");
		         break;
		}
		
	}
}
