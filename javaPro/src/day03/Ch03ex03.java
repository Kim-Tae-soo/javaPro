package day03;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch03ex03 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 
		 * 6. 증감 연산자 : ++, --
		 * 1) ++ : 변수의 값을 1 증가 시킨다.
		 * 		형식) 변수++ 또는 ++변수
		 * 			==> 변수 = 변수 + 1
		 * 
		 * 2) -- : 변수의 값을 1 감소 시킨다.
		 * 		형식) 변수-- 또는 --변수
		 * 			==> 변수 = 변수 - 1
		 * 
		 * ## 증감 연산자가 다른 수식에 사용되면 연산자가 변수 앞에 있는 경우와 변수 뒤에 있는 경우
		 * 	  각각 연산 결과가 달라진다.
		 * 
		 * 		1) 증감 연산자가 변수 뒤에 있는 경우 ex) 변수++, 변수--  ==> 후행처리라고 한다.
		 * 			==> 변수를 수식에 사용한 후에 증감처리를 한다.
		 * 		2) 증감 연산자가 변수 앞에 있는 경우 ex) ++변수, --변수  ==> 선행처리라고 한다.
		 * 			==> 변수의 값을 증감처리한 후에 증감된 값을 수식에 사용한다.
		 */
		
		
		int k = 10;
		System.out.println("초기 값 k = " + k);
		
		k++; // k = k + 1 = 11
		System.out.println("k++ 연순 후 k = " + k);
		++k;
		System.out.println("++k 연순 후 k = " + k);
		
		// 증감 연산자가 다른 식에 사용될 경우
		int x = 10;
		int y = x++;
		
		System.out.println("후행 처리 : x = " + x + ", y = " + y);

		x = 10;
		y = ++x;
		System.out.println("선행 처리 : x = " + x + ", y = " + y);
		
		x = 10;
		y = x++ + x++;
		
		System.out.println("1번 : x = " + x + ", y = " + y); // 12 , 21
		
		x = 10;
		y = x++ + ++x;
		System.out.println("2번 : x = " + x + ", y = " + y);  // 12 , 22
		
		x = 10;
		y = ++x + x++;
		System.out.println("3번 : x = " + x + ", y = " + y); // 12 ,22 y = 10 + 12
		
		x = 10;
		y = ++x + ++x;
		System.out.println("4번 : x = " + x + ", y = " + y); // 12 , 23 y = 11 + 12  
		
		System.out.println("------------------------------------------------------");
		
		/*
		 * 7. 조건 연산자 (삼항 연산자)
		 * 형식 ) 조건식 ? 식1 : 식2
		 * 		==> '조건식'이 참(true)이면 '식1'을 처리한 결과를 반환하고,
		 * 			'조건식'이 거짓(false)이면 '식2'를 처리한 결과를 반환한다.
		 */
		
		int a = 100;
		int b = 101;
		
		// 문제) 변수 a의 값이 짝수인지 홀수인지 출력하시오.
		
		String str = a % 2 == 0 ? "짝수" : "홀수"; 
		System.out.println(a + "는(은)" + str);
		
		String str1 = b % 2 == 1 ? "홀수" : "짝수"; 
		System.out.println(b + "는(은)" + str1);
		
		System.out.println("-----------------------------------------");
		
		/*
		 * 문제) 정수 2개를 입력 받아서 큰 값과 작은 값을 출력하시오.
		 *  ( 입력은 Scanner를 이용한다.)
		 
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("첫번쨰 정수를 입력하시오 >> ");
		int num1 = scan.nextInt(); // 위에서 입력한 정수가 num에 저장이 된다.
		
		System.out.print("두번쨰 정수를 입력하시오 >> ");
		int num2 = scan.nextInt(); // 위에서 입력한 정수가 num1에 저장이 된다.
		
		int max = num1 > num2 ? num1 : num2;
		int min = num1 < num2 ? num1 : num2;
	
		System.out.println("큰 값 : " + max);
		System.out.println("작은 값 : " + min);
		
		*/
		
		/*
		 * 문제) 영문자 1개를 문자형(char)으로 입력 받아 입력 받은 문자가 대문자이면 소문자로, 입력 받은 문자가 소문자이면 대문자로 변경하여 출력하시오.
		 * (참고, 영어 대문자와 소문자의 코드값 차이는32이다.)  
		 * 'A' ==> 65 'a' ==> 97
		 */
		
		/*
		 System.out.print("영문자 1문자를 입력하세요 >> "); InputStreamReader reader = new
		 InputStreamReader(System.in); char ch = (char)reader.read();
		  
		 if(ch>=65 && ch<=90) 
		 {
			 System.out.print("소문자로 변환 : "); 
			 ch += 32;
			 System.out.print(ch); 
		 }
		  
		 else if(ch>=97&&ch<=122) 
		 {  System.out.print("대문자로 변환 : "); 
		 	ch -= 32;
		 	System.out.print(ch); 
		 }
		 
		
		System.out.print("영문자 1문자를 입력하세요 >> ");
		InputStreamReader reader = new InputStreamReader(System.in); 
		char ch = (char)reader.read();
		
		char result = ch >='A' && ch <= 'Z'? (char)(ch+32) : (char)(ch-32);
		
		System.out.println("입력 값 : " + ch);
		System.out.println("변환 값 : " + result);
		
		*/
		
		
		System.out.print("영문자 1문자를 입력하세요 >> ");
		InputStreamReader reader = new InputStreamReader(System.in); 
		char ch = (char)reader.read();
		
		char result = ch >='A' && ch <= 'Z'? (char)(ch+32) : 
					ch >='a' && ch<='z' ? (char)(ch-32): ch;
					
					System.out.println(ch + " ==> " + result);
	}

}
