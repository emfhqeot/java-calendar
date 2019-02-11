package emfhqeot.calendar;

import java.util.Scanner;

public class Repeatif2 {

	public static void main(String[] args) {
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);

		int month = 1;
		while (true) {
			System.out.println("몇월을 알려줄까?");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}

			System.out.printf("%d월은 %d일 입니다.", month, a[month - 1]);
		}
		System.out.println("bye;");
		scanner.close();

	}
}