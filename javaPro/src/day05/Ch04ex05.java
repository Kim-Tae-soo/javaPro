package day05;

import java.util.Scanner;

public class Ch04ex05 {

	public static void main(String[] args) {
		/*
		 * 다중 반목문 ( 중첩 반복문 ) ==> 반복문 안에 반복문이 있는 경우를 말한다.
		 * 
		 */
		/*
		 * for(int i=1; i<=5; i++) { System.out.println("안쪽 반복 전 i = " + i); for(int
		 * j=1; j<=3; j++) { System.out.println("안쪽에서 i = "+ i+ " , j = " +j);
		 * 
		 * }
		 * 
		 * System.out.println("------------------------"); }
		 * 
		 */

		// for문을 이용하여 전체 구구단을 출력하시오.
		/*
		  for (int number = 1; number <= 9; number++) {
		  System.out.println("---------------------------------");
		  System.out.println("구구단 단수 : " + number);
		  
		  for (int add = 1; add <= 9; add++) { System.out.println("단수 : " + number +
		  ", 구구단단단 : " + add + "\n결과 : " + number * add); }
		  System.out.println("---------------------------------"); }
		 */
		// 숙제 : while문을 이용해서 구구단을 출력하시오

		/*
		 
		  *****
		  *****
		  *****
		  *****
		  *****
		 */

		/*
		 * for (int i=1; i<=4; i++) {
		 * 
		 * for(int j=1; j<=5; j++) { System.out.printf("*"); } System.out.println(); }
		 */
		
		/*
		 * for (int i = 1; i <= 5; i++) {
		 * 
		 * for (int j = 1; j <= i; j++) { System.out.printf("*"); }
		 * System.out.println(); }
		 */
		
		/*
		 * 1 ~ 100까지의 합을 구하는데 10의 배수일 때마다 그때까지의 합계를 출력하는 프로그램을 작성하시오.
		 * 
		 *  출력 예시 )
		 *  	1 ~ 10까지의 합 : 55
		 *  	1 ~ 20까지의 합 : 210
		 *  		...
		 *  		...
		 *  	1 ~ 100까지의 합 : 5050
		 *  	(중첩 반복문, 반복은 모두 사용가능)
		 */
		
		/*
		 * 1 ~ 10 사이의 난수 5개를 차례때로 만들고 생선된 난수 값에 맞는 "*"를 출력하시오
		 */
		
		
		
		for(int i=1; i<=5; i++){
			int num = (int)(Math.random() * 10+1);
			System.out.print(num + " >> ");
			for (int j=1; j<= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
