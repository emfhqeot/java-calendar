package emfhqeot.calendar;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇번의 기회를 줄까요?");
		int repeat = scanner.nextInt();
		for(int i = 0; i < repeat; i++) {
			System.out.println("원하는 달 입력하세여");
			int m = scanner.nextInt();
			int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
			System.out.printf("%d월은 %d일까지 입니다.", m, a[m-1]);
			
		}
		//		int number = scanner.nextInt();
		for (int i = 1; i < 13; i++) {

		}
	}

}
