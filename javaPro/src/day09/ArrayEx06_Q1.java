package day09;

import java.util.Scanner;

public class ArrayEx06_Q1 {

	public static void main(String[] args) {

		/*
		 * 정수형 숫자를 입력 받아서 다음과 같이 출력되도록 프로그램을 하시오.
		 * (각 자리수에 해당하는 숫자만큼 "*"을 출력한다.)
		 * 
		 * 입력 예) 
		 * 	정수를 입력하세요 >> 3684
		 * 
		 * 출력 예)
		 * 	
		 * 	***
		 * 	******
		 * 	********
		 * 	****
		 * 
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 >> ");
		int num = sc.nextInt();
		
		String strNum = String.valueOf(num);
		
		
		// String strNum = "" + num; // ==> "" + 123 ==> "123"
		// String strNum = Integer.toString(num);
		
		for(int i=0; i<strNum.length(); i++) {
			char n = strNum.charAt(i); // '3' - '0' ==> 103 - 100 ==> 3
			
			int number = n-'0'; // 각 자리값을 숫자로 변환하기
			
			// 각 자리값 만큼 반복하기
			for (int j=0; j<number; j++) {
				System.out.print("*"); // * 출력
			}
			System.out.println();// 줄바꿈
		
		}

	}

}
