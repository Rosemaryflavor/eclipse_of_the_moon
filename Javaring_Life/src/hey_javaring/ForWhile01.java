package hey_javaring;

public class ForWhile01 {

	public static void main(String[] args) {

		// (예제) 1부터 10까지의 합을 For문으로

		int forTotal = 0;

		for (int i=1; i<=10; i++) {
			forTotal = forTotal + i;
			// total += i;

			// System.out.println(i + " :: " + forTotal);
		}

		System.out.println("for total ==== " + forTotal);



		// (예제) 1부터 100까지의 합을 While문으로

//		int w = 1;
//		int whileTotal = 0;
//
//		while (w <= 100) {
//			whileTotal = whileTotal + w;
//			// whileTotal += w;			
//			w++;
//
//			 System.out.println(w + " :: " + whileTotal);
//		}
//
//		System.out.println("while total ==== " + whileTotal);
//		System.out.println();
		
		
		// (for) 1~100까지의 정수 중 6의 배수 출력
		for (int i=1; i<=100; i++) {
			if(i % 6 == 0) {
				System.out.println(i);
			}
		}
		
		
		// (while) 1~100까지의 정수 중 6의 배수 출력
		int b = 1;
		int whileTotal = 0;
		while (b <= 100) {
			int whileTotal1=whileTotal +b;
			whileTotal1 += b;
	        b++;
			System.out.println(b + " :: " + whileTotal1);
			System.out.println();
		}
		
		
		// (for) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		System.out.println("[for 6의 배수이면서 12의 배수는 아닌 수]");
		
		
		// (while) 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수 출력
		
		int e = 1;
		
		System.out.println("[while 6의 배수이면서 12의 배수는 아닌 수]");
		while (e <= 200) {
			if (e % 6 == 0 && e % 12 !=0) {
				System.out.print(e + " ");
			}
			
			e++;
		}
		
	    // (for) 1~60000까지의 정수 중 100의 배수는 몇개인가?
		int cnt = 0;
		for (int i=1; i<=60000; i++) {
			if(i % 100 == 0) {
				cnt++;
			}
		}
		
		System.out.println("(for) 1~60000까지의 정수 중 100의 배수는 " + cnt + "입니다.");
	}

}