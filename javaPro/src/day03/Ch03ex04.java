package day03;

public class Ch03ex04 {

	public static void main(String[] args) {
		/*
		 *  8. 비트 연산자 : &(비트and) , |(비트or) , ~(비트not)
		 * 
		 *  비트 not 연산자 ( ~) ==> 데이터의 각 비트값 0은 1로 1은 0으로 변환한다.
		 */
		
		byte bb = 10;							// 10의 2진수 ->
		System.out.println("bb = " + bb); 		//  00001010
		System.out.println("~bb = " + (~bb)); 	// 	11110101 ==> 00001010 + 1 ==> 00001011 = 11 앞의 1이 음수를 나태내기에 -11이다.
		
		//Integer.tobinaryString(정수값) ==> 정수값을 2진수로 변환해 준다.
		System.out.println(" bb = " +Integer.toBinaryString(bb));
		System.out.println(" bb = " +Integer.toBinaryString(~bb));

		
		/* 
		 * 비트 and(&)연산 ==> 같은 위치의 비트 값이 모두 1이면 1, 하나라도 0이면 0이 된다.
		 * 비트 or (|)연산 ==> 같은 위치의 비트 값이 하나라도 1이면 1, 모두 0이면 0이 된다.
		 * 비트 xor(^)연산 ==> 같은 위치의 비트 값이 같으면 0, 다르면 1이 된다.
		 *  
		 */
		
		
		// 21 ==> 00010101  
		// 11 ==> 00001011
		
		System.out.println("21 & 11 ==> " + ( 21 & 11 ));  // 00000001
		System.out.println("21 | 11 ==> " + ( 21 | 11 ));  // 00011111 16 + 8 + 4 + 2 + 1
		System.out.println("21 ^ 11 ==> " + ( 21 ^ 11 ));  // 00011110
		
		System.out.println("-------------------------------------------");
		
		
		/*
		 * 9. shfit 연산자 ( >> , <<, >>>) ==> 비트값을 오른쪽이나 왼쪽으로 이동시키는 연산자
		 * 
		 * 
		 * 00001010 를 오른쪽으로 2번 shift 연산 했을 때...
		 * 00000010
		 * 
		 * 
		 * 1) 값 >> 오른쪽으로 이동할회수
		 * 		( '값'의 비트 값들을 오른쪽으로 '이동할 회수'만큼 이동시킨다.)
		 * 		( 왼쪽 끝에서 새로 들어오는 값은 부호 비트와 같은 값이 들어온다.)
		 * 		( '값'을 '2의 이동할회수승'으로 나눈 값과 같다. )
		 * 
		 * 
		 * 00001010 를 왼쪽으로 2번 shfit 연산을 했을 때...
		 * 00101000 
		 * 
		 * 2) 값 << 이동할회수
		 * 		( '값'의 비트 값들을 왼쪽으로 '이동할 회수'만큼 이동시킨다.)
		 * 		( 오른쪽 끝에서 새로 들어오는 값은 0이 들어온다.)
		 * 		( '값'을 '2의 이동할회수승'으로 곱한 값과 같다.)
		 * 
		 * 3) 값 >>> 이동할 회수
		 * 		( 기본적인 처리는 '>>' 와 같다.)
		 * 		( '>>'와 다른 점은 왼쪽 끝에서 새로 들어오는 값이 무조건 0이 된다.)
		 * 
		 */
		
		
		int iBit = -8;
		System.out.println(iBit + " ==> " + Integer.toBinaryString(iBit));
		System.out.println("-8 >> 2 ==> " + (-8 >> 2) + " ==> " + Integer.toBinaryString( -8 >> 2 ) );
		
		System.out.println("-8 >> 2 ==> " + (-8 << 2) + " ==> " + Integer.toBinaryString( -8 << 2 ) );
		
		System.out.println("-8 >> 2 ==> " + (-8 >>> 2) + " ==> " + Integer.toBinaryString( -8 >>> 2 ) );
		
		System.out.printf("[%32s]\n", Integer.toBinaryString(-8 >> 2));
		System.out.printf("[%32s]\n", Integer.toBinaryString(-8 >>> 2));
	}

}
