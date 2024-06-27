package hey_javaring.book;

import java.util.Scanner;

public class MemberArray {

	private static Scanner sc = new Scanner(System.in);

	public static String[] main(String[] args) {
		/**
		 * [ 요구사항 ]
		 * 
		 *  1. 다섯명의 회원명을 입력받아 String 배열을 생성하시오.
		 *  
		 */
		String[] Names = {"회원1", "회원2", "회원3", "회원4", "회원5"};
  		String[] andNames = new String[5];
  		for (int i = 0; i<5; i++) {
  			System.out.print("이름을 입력해 주세요: ");
  			Names[i] = sc.next();
  		}
      System.out.println(" -----회원 정보 입력 완료------");
      
      return Names;
	}

	// 다섯명의 회원명을 입력받아 String 배열을 생성할 method


	// 생성된 회원정보를 출력하는 method
public static void memberSelect(String[] args) {
	
	for(int i=0; i<args.length; i++) {
		System.out.println("[회원" + (i+1) + " ] 이름 : " +args[i]); 
	}
}

}