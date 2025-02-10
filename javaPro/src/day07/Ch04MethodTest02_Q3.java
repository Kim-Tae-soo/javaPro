package day07;

import java.util.Scanner;


public class Ch04MethodTest02_Q3 {
	/*
	  문제4) 두 정수를 매개변수로 받아서 작은 수부터 큰 수까지의 합계를 구하는 메서드를 구현하시오.
	 */
	//두 정수를 매개변수로 받아서 작은 수부터 큰 수까지의 합계를반환하는 메서드
	// 해당 문제는 Ch04MetjodTest02_Q1에 있는 메서드를 가져와도 된다.
	
	
	
	public static int getAdd(int num1, int num2) {
		
		int sum = 0;
	        
	        int start = Math.min(num1, num2);
	        int end = Math.max(num1, num2);

	        for (int i = start; i <= end; i++) {
	            sum += i;
	        }

	        return sum;

	    
	}
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        
        System.out.print("두 정수를 입력하세요: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        
        int result = getAdd(num1, num2);
        System.out.println(num1 + "부터 " + num2 + "까지의 합: " + result);

        scan.close();

	}

}
