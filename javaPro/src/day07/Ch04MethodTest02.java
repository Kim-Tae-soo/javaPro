package day07;

import java.util.Scanner;

public class Ch04MethodTest02 {
	
	//내가 한 방법
	public static int test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		int num = scan.nextInt();
		
		int j = 1;

			while(j <= 9) {
				System.out.println(num + " * "+ j + " = " + (num*j));
				System.out.println("");
				j++;	
		}	
		return num; // 반환값이 int이기 떄문에 다른 데이터 타입이 오면 조짐
	}
	
	// 선생님 풀이
	public static void printG(int dan) {
		System.out.println(dan + " 단");
		for(int i=1; i<=9; i++) {
			int r= dan * i;
			System.out.println(dan + " * " + i + " = " + r);
		}
	}

	public static void main(String[] args) {
		/*
		 	문제 ) 
		 	정수를 하나 입력 받아서 해당 덩수에 맞는 단을 출력하시오
		 	(단, 해당 정수에 맞는 단을 출력하는 부분을 메서드에서 처리한다.)
		 */
	
		System.out.println("내가 만든 구구단단단");
		test();
	
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("선생님 만든 구구단단단");
		int num = scan.nextInt();
		printG(num);
	
	
		
		
	}

}
