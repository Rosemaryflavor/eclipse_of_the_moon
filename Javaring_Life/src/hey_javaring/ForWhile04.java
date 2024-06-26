package hey_javaring;

import java.util.Scanner;

public class ForWhile04 {

	public static void main(String[] args) {

		// 1~9단까지 구구단을 모두 출력해 보세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("======1~9단 구구단 출력====== ");
		
		int dan = sc.nextInt();
		
		
		// while 문 활용
		System.out.println("====== [ while문 ] 구구단 ==========");
int hang = 1;
		
		while (hang <= 9) {
			int result = 0;
			result = dan * hang;
			System.out.println(dan + " * " + hang + " = " + result);
			hang++;
		}
		
		
		
		
		
		// for 문 활용
		System.out.println("====== [ for문 ] 구구단 ==========");
		
		for (int dan1=1; dan1<=9; dan1++) {
			System.out.println(" [for] " + dan1 + " 단");
			
			for (int hang1=1; hang1<=9; hang1++) {
				int result=0;
				result = dan1 * hang1;
				System.out.println(dan1 + " * " + hang1 + " = " + result);
				hang1++;
			}
			dan1++;
		
		
		System.out.println();
		
		

		}
	}

}