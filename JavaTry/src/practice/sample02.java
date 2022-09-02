package practice;

public class sample02 {
	public static void main(String[] args) {
		int max, min, i, num;
		
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		
		for (i = 0; i < args.length; i++) {
			num = Integer.parseInt(args[i]);
			if (max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
		}
		
		System.out.println("最大値 = " + max);
		System.out.println("最小値 = " + min);
	}
}
