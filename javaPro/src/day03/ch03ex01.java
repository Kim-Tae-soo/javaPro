package day03;

public class ch03ex01 {

	public static void main(String[] args) {
		// 연산자
		
		/*
		 * 
		 * 1. 산술연산자 	==> 수식 계산용 연산자 ex) +, 0, *, /, %(나머지)
		 *  
		 * */
		
		int a = 100;
		int b = 30;
		
		int c = a+ b;
		
		System.out.println(a + " + " + b + " = " + c);
		
		System.out.println("덧셈 : " + (a + b));
		System.out.println("뺄셈 : " + (a - b));
		System.out.println("곱셈 : " + (a * b));
		System.out.println("몫 : " + (a / b));
		System.out.println("나머지 : " + (a % b));
		
		/*
		 *  컴퓨터는 연산을 할 때 데이터의 자료형을 통일시켜 놓고계산을 진행한다.
		 *  
		 *  계산된 결과는 통일된 자료형과 같다.
		 * */
		
		System.out.println("100 + 2.3" + " = " + (100+2.3));
		System.out.println("10 + 4" + " = " + (10/4));
		System.out.println("10 / 4.0" + " = " + (10/4.0));
		System.out.println("10.0 / 4.0" + " = " + (10.0/4.0));
		System.out.println("10.0 / 4.0" + " = " + (10.0/4));

		/*
		 * 정수 / 정수 = 소숫점이 나오지 않음.
		 * 정수 / 실수 , 실수 / 실수 , 실수 / 정수 => 소숫점까지 나옴
		 * */
		
		System.out.println("나머지 : " + (10%3));
		System.out.println("나머지 : " + (a % b));
		System.out.println("---------------------------------------------");
		/*
		 * 	int형보다 작은 자료형을 산술 연산하면 int형보다 작은 자료형은 int형으로 변환된 후에 계산된다.
		 *  ex ) short sh2 = by + sh << 오류 
		 *  수정방안 1 ==> short sh2 = (short)(by + sh); 
		 *  수정방안 2 ==> int sh2 = by + sh;
		 */
		
		byte by = 120;
		short sh = 300;
		char ch = 'A';
		char ch2 = 'a'; 
		short sh2 = (short)(by + sh);
		
		
		System.out.println("byte형 + short형 ==> " + sh2);
		System.out.println("byte형 + short형 ==> " + (by + sh));
		
		/*
		 *  char형을 산술연산에 사용하면 char형 변수에 저장된 문자의 코드값을 사용하여 계산한다.
		 */
		
		int kk = ch2 - ch; // 'a' = 'A' ==> a = 97 - A = 65 ==>> 97 - 65 = 32
		System.out.println(ch2 + " - " + ch + " = " + kk);
		
		/*
		 * 2. 비교연산자
		 * ex ) == (같다) , != (같지 않다), > , < , >= , =< (크다 , 작다 , 크거나 같다 , 작거나 같다)
		 * 값의 크기를 비교 할 때 사용하는 연산자
		 * 연산 결과는 True , False가 된다.
		 */
		
		boolean bb = 100 == 100;
		boolean bb2 = 100 != 100;
		
		System.out.println("bb = " + bb);
		System.out.println("bb2 = " + bb2);
		
		System.out.println("100 > 120 ==> " + (100 > 120));
		System.out.println("100 < 120 ==> " + (100 < 120));
		System.out.println("100 >= 120 ==> " + (100 >= 120));
		System.out.println("100 =< 120 ==> " + (100 <= 120));
		
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		/*
		 * 3. 논리 연산자
		 * && (and) , ||(or) , ! (not)
		 * 논리값을 이용한 연산을 수행한다.
		 * 연산 결과도 true 또는  false가 된다.
		 * 
		 * 1) 논리값1 && 논리값2
		 * 		==> 두 논리값이 모두 참이면 결과가 참(true)이(가) 된다.
		 * 		T && T ==> T
		 * 		T && F ==> F
		 * 		F && T ==> F
		 * 		F && F ==> F
		 * 
		 * 2) 논리값1 || 논리값2
		 * 		==> 두 논리값중 하나만 참이면 결과가 참이 된다.
		 * 		T || T ==> T
		 * 		T || F ==> T
		 * 		F || T ==> T
		 * 		F || F ==> F
		 * 3) !논리값 (not은 논리값 앞에 !를 붙힌다.)
		 * 		==> 논리값의 반대값이 결과값이 된다.
		 * 		!T ==> F
		 * 		!F ==> T
		 * 
		 */
		
		boolean bbb = true && false ;;
		System.out.println("bbb = " + bbb);
		
		// 논리 연산자는 보통 비교 연산자와 같이 사용한다.
		
		bbb = (300>200) && (100==200);
		System.out.println("bbb = " + bbb);
		
		bbb = (300>200) || (100==200);
		System.out.println("bbb = " + bbb); //!T || F ==> F || F ==> F
		
		bbb = !(300>200) || (100==200);
		System.out.println("bbb = " + bbb); //!T || F ==> F || F ==> F
		
	}

}
