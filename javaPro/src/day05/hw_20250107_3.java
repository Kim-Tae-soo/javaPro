package day05;

import java.util.Scanner;

public class hw_20250107_3 {
	public static void main(String[] args) {

		/*
		 * 1 ~ 100까지의 합을 구하는데 10의 배수일 때마다 그때까지의 합계를 출력하는 프로그램을 작성하시오.
		 * 
		 * 출력 예시 ) 1 ~ 10까지의 합 : 55 
		 * 1 ~ 20까지의 합 : 210
		 *   ...
		 *   ... 
		 * 1 ~ 100까지의 합 : 5050 (
		 * (중첩 반복문, 반복은 모두 사용가능)
		 */
		

		/* 내가 한거
		 // 외부 반복문: i는 1부터 100까지 반복
        for (int i = 10; i <= 100; i += 10) {
            int sum = 0;  // 합을 저장할 변수

            // 내부 반복문: j는 1부터 i까지 반복
            for (int j = 1; j <= i; j++) {
                sum += j;  // j를 sum에 더함
            }

            // 10의 배수마다 합을 출력
            System.out.println("1~" + i + "까지의 합 : " + sum);
        }
        */
		
		//반복문 한번만 사용
		int sum =0;
		for(int i=1; i<=100; i++) {
			sum += i;
			if (i%10 == 0) {
				System.out.println("1 ~ " + i + " 까지의 합 : " + sum);
			}
		}

	}
}
