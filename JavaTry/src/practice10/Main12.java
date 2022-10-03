package practice10;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main12 {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2022/10/03", fmt);
		
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		LocalDate now = LocalDate.now();
		if (now.isAfter(ldate)) {
			System.out.println("1000日後は過去の日付です");
		}
		
		LocalDate d1 = LocalDate.of(2020,1,1);
		LocalDate d2 = LocalDate.of(2020,1,4);
		
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		
		LocalDate d3 = d2.plus(p2);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(d3);
	}
}
