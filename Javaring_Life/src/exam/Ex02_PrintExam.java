package exam;

public class Ex02_PrintExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str1 = "12"; String str2 = "25"; String str3 = "크리스마스";
System.out.println(str1 + "월" + str2 + "일은" + str3 + "입니다.");

String str4 = "2023"; String str5 = "72.893";
System.out.println("작년" + str4 + "년도 대학 합격률은" + str5 + "입니다.");

int str6 = 100; int str7 = 10; 

System.out.println(str6 + "이라는 숫자에" + str7 + "을 더 하면" + (str6 + str7) +"이 됩니다.");

double str8 = 3.141592653589793; int str9 = 5;
System.out.println("원주율은" + str8 +"이고," + "반지름이" + str9 +"인 원의 둘레는" + ((str8 * str9) * 2)+ "입니다." );

System.out.println("반지름이"+ str9 +"인 원의 넓이는"+(str8 * str9 * str9)+ "입니다.");

char charValue = '뷁'; 
int str10 = charValue;
System.out.println("str10" + str10);

double str11 = 58.78945;
int j = (int) str11;
System.out.println("str11" + str11);
System.out.println("j" + j);


		//12월 25일은 크리스마스 입니다.
		//작년 2023년도 대학 합격률은 72.893 퍼센트 였습니다.
		//100이라는 숫자에 10을 더하면 110이 됩니다.
		//원주율은 3.141592653589793 이고, 반지름이 5인 원의 둘레는 31.41592653589793 입니다.
		//반지름이 5인 원의 넓이는 78.53981633974483 입니다.
		//뷁의 문자번호는 48577 입니다.
		//58.78945를 버림 하면 58 입니다.
		
	}

}
