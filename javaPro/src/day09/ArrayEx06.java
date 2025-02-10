package day09;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		// 문자열을 배열처럼 사용하기
		
		/*
		 * 문자열.charAr(위치;)
		 *  	==> '문자열'중에서 '위치'번째에 해당하는 한 문자를 추출한다.
		 *  	==> 반환되는 값의 자료형은 char형이 된다. ( 위치 값은 0부터 카운트 한다. )
		 * 문자열.length()
		 * 		==> 문자열의 길이(글자수)를 반환한다.
		 * 문자열.toCharArray();
		 * 		==> 문자열을 분해하여 각각의 문자들을 char형 배열로 만들어 변환한다.
		 */
		
		String str = "자바 공부중";
		System.out.println("str의 길이 : " + str.length());
		
		char ch = str.charAt(3);
		System.out.println("ch = " + ch);
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(i+"번쨰 문자 : "+str.charAt(i));
			
		}
		System.out.println();
		//문자열의 문자들을 char형 배열에 저장하기.
		char[] charArr = str.toCharArray();
		for(int i=0; i<charArr.length; i++) {
			System.out.println("charArr[" + i +"] =" + charArr[i]);
		}
		System.out.println();
		/*
		 * Array.toString(배열)
		 * 		==> '배열'의 요소값들을 각각 연결하여 하나의 문자열 현태로 만들어서 변환한다.
		 * 		==> 반환되는 모양 : "[값1, 값2, ...]"
		 */
		
		System.out.println();
		System.out.println(Arrays.toString(charArr));
		System.out.println();
		/*
		 * - 숫자를 문자열로 변환하기
		 * String.valueOf( 숫자 );
		 * 예) String.valueOf(1234); ==> 숫자 1234가 문자열 "1234"로 변경된다.
		 * 
		 * - 문자열을 숫자로 변환하기 ( 단, 문자열은 숫자로만 구성되어 있어야 한다.)
		 * 1. int형 : Integer.parseInt(문자열);
		 * 2. long형 : Long.parseLong(문자열);
		 * 3. float형 : Float.parseFloat(문자열);
		 * 4. double형 : Double.parseDouble(문자열);
		 */
		
		int a = 1234;
		String str2 = String.valueOf(a);
		System.out.println(a+str2);
		
		String str3 = "123";
		
		int ia = Integer.parseInt(str3);
		System.out.println(ia+100);
		
		long il = Long.parseLong(str3);
		System.out.println(il);
		
		String str4 = "123.456";
		float fa = Float.parseFloat(str4);
		double da = Double.parseDouble(str4);
		
		System.out.println(fa);
		System.out.println(da);
		System.out.println(fa+da);
		
		/*
		 * 정수형 숫자를 입력 받아서 다음과 같이 출력되도록 프로그램을 하시오.
		 */
		
		
		
	}

}
