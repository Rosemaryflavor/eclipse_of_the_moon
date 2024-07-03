package hey_javaring.calc;

import java.util.Scanner;

public class CalcSumEx {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args, int result) {

		/*
		[ 요구사항 ]
		- 숫자를 연속으로 입력받아 합계를 구하세요.
		- 숫자 0 을 입력 받으면 반복을 멈추고 최종 결과를 보여주세요.
		--------------------------

		 */

	// 숫자 입력 받기 method 
	String calcStr = "";
	int num= 0;
	int sum = 0;
	
	boolean flag = true;
	
	while (flag) {
	   num = getNum();
	   result = result + num;
	   
	   if (num == 0) {
		   flag = false;
		   continue;
	   }
	   
	   System.out.println(calcStr);
	   
	   if ("".equals(calcStr)) {
		   calcStr = calcStr + " + " + num;
	   } else {
		   calcStr = calcStr + " + " + num;
	   }
	   
	   System.out.println(calcStr + " = " + result);
		}
	}
	

	private static int getNum() {
		// TODO Auto-generated method stub
		return 0;
	}


	private static int sum(int num) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}
