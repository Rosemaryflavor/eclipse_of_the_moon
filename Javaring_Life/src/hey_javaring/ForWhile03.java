package hey_javaring;

import java.util.Scanner;

public class ForWhile03 {

	public static void main(String[] args) {

		// 정수를 입력 받아 구구단을 출력해 보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("어떤 단수의 구구단을 출력할까요 : ");
		
		int dan = sc.nextInt();
		
		
		// while 문 활용
		System.out.println("====== [ while문 ] " + dan + " 단 ==========");
		int hang = 1;
		
		while (hang <= 9) {
			int result = 0;
			result = dan * hang;
			System.out.println(dan + " * " + hang + " = " + result);
			hang++;
		}
		
		
		
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] " + dan + " 단 ==========");
		
		for ( int i=1; i<=9; i++) {
			int result = 0;
			
		}
		
		
		
		
		sc.close();
		
	}

}