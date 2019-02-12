package emfhqeot.calendar;

import java.util.Scanner;

public class Nicecalendar {

	public static void main(String[] args) {
		String PROMPT = "YEAR> ";
		String PROMPT2 = "MONTH> ";
		String PROMPT3 = "WEEK> ";
		int[] maxday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] maxday2 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		Scanner scanner = new Scanner(System.in);
//		while(true) {
		System.out.println("년도를 입력하세요.");
		System.out.print(PROMPT);
		int year;
		year = scanner.nextInt();
		System.out.println("월을 입력하세요.");
		System.out.print(PROMPT2);
		int month;
		month = scanner.nextInt();

		System.out.printf("    <<%5d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" --------------------");
		for (int i = 1; i <= maxday[month - 1]; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0)
				System.out.println();

		}
		int weekday;
		System.out.println("첫번째 요일을 입력하세요. (SU MO TU WE TH FR SA)");
		System.out.print(PROMPT3);
		weekday = scanner.nextInt();
	}
		

}
