package day04;

import java.util.Scanner;

public class Ch04ex02 {

	public static void main(String[] args) {
		/*
		 * 2) switch문 형식 ) switch(조건변수){ case 값1 : 실행문 1; ~~~ break; case 값2 : 실행문 2;
		 * ~~~ break; case 값3 : 실행문 3; ~~~ break; ~~~ case 값m : 실행문 m; ~~~ break;
		 * default : 실행문n; ~~~
		 * 
		 * }
		 * 
		 * - '조건변수'에는 변수, 수식, 리터럴, 상수가 올 수 있다. - case문 '값'은 정수유형과 문자열만 사용할 수 있다.
		 * 
		 * 
		 */

		/*
		 * 정수를 입력 받아 짝수, 홀수를 판정하는 프로그램을 작성하시오.
		 */

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("정수를 입력하세요 >> "); int
		 * num = scan.nextInt();
		 * 
		 * String result = "";
		 * 
		 * switch (num % 2) { case 0: result = "짝수"; break;
		 * 
		 * case 1: result = "홀수"; break;
		 * 
		 * default : result = "홀수"; }
		 * 
		 * System.out.println(num + "은(는) " + result);
		 */

		/*
		 * 월(1~12)을 입력 받아 해당 월의 계절을 출력하시오. (switch문 이용) 조건) 봄 : 3,4,5 / 여름 : 6,7,8 / 가을
		 * : 9,10,11 / 겨울 : 12 , 1 , 2
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("월을 입력하세요 (1 ~ 12) >> ");
		 * 
		 * int month = scan.nextInt();
		 * 
		 * String season = ""; switch (month) { case 3, 4, 5: season = "봄"; break;
		 * 
		 * case 6, 7, 8: season = "여름"; break;
		 * 
		 * case 9, 10, 11: season = "가을"; break;
		 * 
		 * case 12, 1, 2: season = "겨울"; break;
		 * 
		 * }
		 * 
		 * System.out.println(month + "월은 " + "'" + season + "'" + " 입니다.");
		 */
		 /*
		 * 점수를 입력 받아서 학점을 구하시오
		 */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요 >> ");
		int score = scan.nextInt();
		String  grade;
		
		switch(score /10 ) {
		case 10,9:{ grade = "A학점"; break;}
		case 8:{ grade = "B학점"; break;}
		case 7:{ grade = "C학점"; break;}
		case 6:{ grade = "D학점"; break;}
		
		default : grade = "F학점";
		
		
		
		}
		
		System.out.println(score + "점수는 " + "'" + grade + "'" + " 입니다.");

	}

}
