package abs01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Lottostore {
	private Scanner sc = new Scanner(System.in);
	private String i;

	public static void main(String[] args) {
		new Lottostore().startLotto();
	}

	public void startLotto() {
		while(true) {
			int choice = displayMenu();

			switch(choice) {
			case 1:
				saleLotto();
				break;
			case 2:
				System.out.println("안녕히 가세요.");
				break;
			default:
				System.out.println("1 또는 2를 입력하시오.");

			}
		}
	}

	public int displayMenu() {
		System.out.println("=== 로또 판매점 === ");
		System.out.println("1. Lotto 구매하기");
		System.out.println("2. 프로그램 종료");
		System.out.println("================");
		System.out.println("선택 : ");
		int choice = sc.nextInt();

		return choice;
	}

	public void saleLotto() {
		System.out.println("1000원에 로또 번호 하나씩.");
		System.out.println("로또는 최대 100매까지 구매 가능.");
		System.out.println("구매를 원하시는 금액을 입력.");
		System.out.println("금액 입력 : ");
		int money = sc.nextInt();

		System.out.println();
		if (money < 1000) {
			System.out.println("입력 금액이 적다. 1000원 이상으로 입력하라.");
			return;
		}

		if(money > 100001) {
			System.out.println("구매 금액이 너무 크다. 10만원 이상은 구매가 불가하다.");
			return;

		}

		createLotto(money);
		System.out.println();
		System.out.println("받은 금액은" + money + "원 이고, 거스름돈은" + (money %1000) + "원 이다.");

	}

	public void createLotto(int money) {
		int lotCnt = money / 1000;

		HashSet<Integer> lottoSet = new HashSet<Integer>();

		for(int i=1; i<=lotCnt; i++) {
			while(lottoSet.size()<6) {
				int lotNum = (int) (Math.random() * 45 + 1);
				lottoSet.add(lotNum);
			}


			ArrayList<Integer>lottoList = new ArrayList<Integer>(lottoSet);
			Collections.sort(lottoList);

			System.out.print("로또 번호 : " + i + "번 >>> ");

			for(int lottoNum : lottoList) {
				System.out.print(lottoNum + "");
			}
			
			System.out.println();
			
			lottoSet.clear();
		}
	}
}
