package day05;

import java.util.Scanner;

public class Ch04ex03 {

	public static void main(String[] args) {
		/*
		 * 2. 반복문 1) for문 형식) for(초기화; 조건식; 증감식){ 반복할 문장들; .... .... }
		 * 
		 * 
		 * 2) while문 형식 ) while(조건식) { 반복할 문장들; .... .... }
		 * 
		 * 3) do ~ while문 형식) do { 반복할 문장들; .... .... }while(조건식);
		 */

		/*
		 * for(int i=1; i <=10; i++ ) { System.out.println("안녕하세요. (for)"); }
		 */

		/*
		 * int i = 1; while (i <=10) { System.out.println("안녕하세요. (while)"); i++; }
		 */

		/*
		 * int a = 1; do { System.out.println("안녕하세요. (do~while문)"); a++; }while(a<=10);
		 */

		/*
		 * for(int i=1; i <=10; i++ ) { System.out.println(i); }
		 */
		/*
		 * int sum =0; for (int i=1; i<=10; i++) { sum = sum + i; }
		 * System.out.println(sum);
		 */

		/*
		 * int sum = 0; for (int i=2; i<=10; i+=2) { sum += i;
		 * 
		 * } System.out.println(sum);
		 */

		/*
		 * 영어 대문자를 A부터 Z까지 차례로 출력하시오. (단, 대문자와 짝이되는 소문자도 같이 출력한다.
		 */

		// 영문자의 코드값을 이용한 풀이
		/*
		 * for(int ch=65; ch<=90; ch++) { System.out.println((char)ch + " ===> " +
		 * (char)(ch+32)); }
		 */
		/*
		 * // 두번쨰 방법 for(char ch='A'; ch<='Z'; ch++) { System.out.println(ch + " ===> "
		 * + (char)(ch+32)); }
		 */

		// 내가 한 방법
		/*
		 * char ch='A';
		 * 
		 * for(int i=1;i<=26;i++) { System.out.println(ch+" ===> " + (char)(ch+32));
		 * ch+=1; }
		 */
		/*
		 * int d = 7; for(int i=1; i<=9; i++) { int r = d * i; System.out.println(d +
		 * " * " + i + " = " + r); }
		 */

		// int number = 0;
		// int add = 1;

		Scanner scan = new Scanner(System.in);
		/*
		 * System.out.println("구구단 출력 >> "); number=scan.nextInt();
		 * 
		 * // add가 9보다 작거나 같을 때 반복문 시작. // while (add<=9;) for (int add =1; add <= 9;) {
		 * System.out.println(number + " * " + add + " = " + number * add); add++; }
		 */

		/*
		 * 1 이상의 정수를 입력 받아 1부터 입력한 정수까지의 합계를 구하시오.
		 * 
		 * 
		 * System.out.println("정수를 입력하세요 >> "); int i = scan.nextInt();
		 * 
		 * int sum = 0; for (int d=1; d<=i; d++) { sum = sum + d;
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 */
		/*
		  한번에 하나씩 10개의 정수를 입력 받아서 입력한 정수들의 합계를 구하시오.
		 */
		
		
		
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			System.out.println(i + "번째 정수 입력 >>");
			int num = scan.nextInt();
			
			sum += num;
		}
		
		System.out.println(sum);
			
	}

}
