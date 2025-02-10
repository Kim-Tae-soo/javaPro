package day05;

public class hw_20250107_1 {

	public static void main(String[] args) {
		/*
		 * 과제명 : while문을 이용한 구구단 만들기 
		 * 일정 : 2025년 01월 07일
		 * 
		 */

		/* 내가 한것
		int i = 1;
		int j = 1;
		
		while (i <= 9) {
			System.out.println(i+" 단");

			while(j <= 9) {
				System.out.printf(i + " * " + j + " = " + (i*j));
				System.out.println("");
				j++;
				
				
			}
			i++;
			j = 1;
			System.out.println("");
		*/
		
		// 선생님 코드
		int dan =2;
		while(dan<=9) {
			System.out.println(dan + "단");
			
			int num = 1;
			while(num<=9) {
				int r = dan * num;
				System.out.printf("%d * %d = %d\n", dan ,num,r);
				num++;
			}
			System.out.println("----------------------------");
			System.out.println();
			dan++;
			
		}

	}

}
