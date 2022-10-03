package practice10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main12 {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		LocalDate now = LocalDate.now();
		if (now.isAfter(ldate)) {
			System.out.println("1000日後は過去の日付です");
		}
	}
}
