
public class Chapter08 {
	public static void main(String[] args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		
		int array[] = { 1, 2, 3, 4 };
		for (int num = 0; num < array.length; num++) {
			System.out.println(array[num]);
		}
		
        // 3. 拡張「for」文
        for (int val : array) {
            if (val % 2 == 0) {
                continue;
            }
            System.out.println(val);
        }
	}
}
