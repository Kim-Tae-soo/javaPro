package day03;

import java.util.Scanner;

public class Ch03ex02 {

	public static void main(String[] args) {
		// 4) 대입 연산자 : = 
		/*		형식 ) 변수 = 값(리터럴)
		 * 			  변수 = 상수;
		 * 			  변수 = 수식;
		 * 			  변수 = 변수2;
		 * 			== > '=' 오른쪽의 결과를 '='왼쪽의 변수에  대입(저장)시킨다.
		 */
		
		int k;
		int i = 10;
		k = i + 20;
		
		System.out.println("i = " +i);
		System.out.println("k = " +k);
		System.out.println("--------------------------------------------------------");
		
		/*
		 * 5) 복합 대입 연산자 : += , -=, *=, /= , %=,
		 * 				비트 연산자=, shift연산자=
		 */
		
		
		
		//k = k + 30;
		
		// 변수 = 변수 + 값 ==> 변수 += 값;
		// 변수 = 변수 - 값 ==> 변수 -= 값;
		// 변수 = 변수 * 값 ==> 변수 *= 값;
		// 변수 = 변수 / 값 ==> 변수 /= 값;
		// 변수 = 변수 % 값 ==> 변수 %= 값;
		
		k += 30;
		
		System.out.println("k = " + k);
		
		
		i -=30;
		System.out.println("i = " + i);
		
		
		// 문제 ) 3자리의 정수를 입력 받아서 각 자리값들을 출력하시오.
		// 입력은 Scanner를 이용한다.
		// 입력 예 ) 3자리의 정수를 입력하시오 >> 456
		// 출력 예 ) 100의자리 : 4 10의 자리 : 5 1의자리 : 6
		
		/*
		 
		Scanner scan = new Scanner(System.in); 
		System.out.print("3자리의 정수를 입력하시오 >> ");
		int num = scan.nextInt(); // 위에서 입력한 정수가 num에 저장이 된다.
		int num2 = num / 100;
		int num3 = num % 100;
		int num4 = num3 / 10;
		int num5 = num3 % 10;
		
		System.out.println("100의 자리 : " + num2);
		System.out.println(" 10의 자리 : " + num4);
		System.out.println("  1의 자리 : " + num5);
		
		System.out.println("--------------------------------------------------------");
		
		*/
		
		// 문제) 초 단위의 값을 입력 받아서 입력한 초 단위 값이 몇 시간 , 분 초 인지 출력하시오
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("초 단위의 시간을 입력하시오. >> ");
		int time = sc.nextInt(); // 위에서 입력한 정수가 time에 저장이 된다.
		
		int time1 = time / 3600;
		int time2 = (time % 3600) / 60;
		int time3 = (time % 3600) % 60;
		
		System.out.println("입력하신 " + time + "초의 시간 분 초는 아래와 같습니다.");
		System.out.println("시간 : " +time1 +"시간");
		System.out.println("분 : " + time2 +"분");
		System.out.println("초 : " + time3 +"초");
		
	}

}
