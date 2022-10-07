package practice11;

public class Main14 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
		
		int count = 0;
		int point = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50) {
				count++;
			} else {
				point++;
			}
		}
		System.out.println("50点以上の科目は：" + count);
		System.out.println("50点以下の科目は：" + point);
	}
}
