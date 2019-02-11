package emfhqeot.calendar;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("무슨 달을 알려줄까요?");
		
		int m = scanner.nextInt();
		int[] a = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 };
		
		System.out.printf("%d월은 %d일까지 입니다.", m, a[m-1]);

		Scanner.close;
		}

	}

//1 3 5 7 8 10 12 , 2 , 4 6 9 11