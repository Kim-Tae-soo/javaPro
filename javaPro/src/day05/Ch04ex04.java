package day05;

import java.util.Scanner;

public class Ch04ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 	정수형 숫자를 차례로 입력 받아 입력 받은 정수들의 합계를 구하시오.
		 	(입력의 마지막은 0을 입력했을 때로 한다.) ex) while , do while
		 */
		
		/*
				do ~ while 문
		int sum = 0;		//합계가 저장될 변수
		int num;			//입력한 값이 저장될 변수
		
		do {
			System.out.print("정수 입력 >>");
			num = scan.nextInt();
			
			sum = sum + num; // sum += num;
			}while(num!=0);
		
		System.out.println("합계 : "+sum);
		
		*/
		
		/*
		//방법2) while문 이용하기
		
		int sum = 0;
		int num = 0;
		
		num = -1;
		while(num!=0) {
			System.out.println("정수 입력 >> ");
			num = scan.nextInt();
			
			sum += num;
		}
		System.out.println("합계 : " + sum);
		*/
		
		// 1~10 사이의 난수를 하나 만들어 놓고 이 난수값을 맞추는 프로그램을 작성하시오.
		// 출력은 몇 번만에 맞췄는 지를 출력하시오
		
		int rnd = (int)(Math.random() * (10-1+1)+1);
		int cnt = 0;
		int userinput = 0;
		
		
		while (userinput != rnd) {
		
			System.out.println("1 ~ 10사이에 난수값 입력 >> ");
			userinput = scan.nextInt();
			cnt++;
			
		}
		
		System.out.println("정답은 " + rnd +  "(이)가 맞습니다. "+ "\n 총 시도 횟수 : " +cnt+"회");
					
	}

}
