package day09;

public class ArrayEx07_Q1 {

	public static void main(String[] args) {
		/*
		 * 인자값이 '숫자 연산자 숫자'일 때 
		 * 연산자에 맞는 계산을 수행하는 프로그램을 작성하시오.
		 * (언산자는 +,-,*,/,% 로 한다.)
		 * 
		 * 	실행예) java 패키지명.클래스명 20*30
		 * 	출력예) 20 * 30
		 */
		
		if(args.length<3) {
			System.out.println("인자값이 부족합니다..");
			System.out.println("인자값은 '숫자 연산자 숫자' 입니다..");
		}else {
			int num1 = Integer.parseInt(args[0]);
			String op = args[1];
			int num2 = Integer.parseInt(args[2]);
			
			double result = 0.0;
			switch(op) {
			case "+" : result = num1 + num2; break;
			case "-" : result = num1 - num2; break;
			case "*" : result = num1 * num2; break;
			case "/" : result = num1 / num2; break;
			case "%" : result = num1 % num2; break;
			}
			
			System.out.printf("%d %s %d = %.2f\n",num1,op,num2,result);
		}
	}

}
