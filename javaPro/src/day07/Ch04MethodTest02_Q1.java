package day07;

import java.util.Scanner;

public class Ch04MethodTest02_Q1 {


	/*
	 * 문제2) 정수 2개를 차례로 입력 받아 큰 수와 작은 출력하시오. (단 두 정수중 큰 수를 찾아내는 메서드와 작은 수를 찾아내는 메서드를
	 * 구현하시오.)
	 */

	public static int getMax(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static int getMin(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public static void main(String[] args) {

		
	      Scanner scan = new Scanner(System.in);

	        // 사용자로부터 두 정수를 입력 받음
	        System.out.print("두 정수를 입력하세요: ");
	        int num1 = scan.nextInt();
	        int num2 = scan.nextInt();

	        // 큰 수와 작은 수를 구하고 출력
	        int max = getMax(num1, num2);
	        int min = getMin(num1, num2);

	        System.out.println("큰 수: " + max);
	        System.out.println("작은 수: " + min);

	        scan.close();

	}

}
