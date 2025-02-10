package day02;

public class Ch02ex05 {

	public static void main(String[] args) {
	
		/*
		 * 출력 연습
		 * print(), println(), printf()
		 */
		
		System.out.println("이것은 줄바꿈이 있습니다.");
		System.out.print("안녕하세요.");
		System.out.print("위 줄과 사이에 줄바꿈이 없습니다.\n");
		System.out.println("----------------------------");
		
		/*
		 * 형식화된 데이터 출력하기 ==> printf() 이용
		 * 형식 (System.out.prinf("형식화된 문자열", 출력한 값들...);
		 * 
		 * '형식화된 문자열'에 사용할 수 있는 기호 문자들
		 * 1)%b ==> 논리값 (boolean)
		 * 2)%d ==> 10진수 정수형
		 * 3)%o ==> 8진수 정수형
		 * 4)%x ==> 16진수 정수형
		 * 5)%f ==> 실수형
		 * 6)%e ==> 실수형을 지수형으로 표기
		 * 7)%c ==> 문자형
		 * 8)%s ==> 문자열
		 * 9)%n ==> 줄바꿈
		 */
		
		int ia = 1230;
		float fb = 123.456f;
		double dc = 123.45678;
		boolean bd = false;
		char ch = 'A';
		String str = "안녕하세요";
		
		
		System.out.printf("8진수 = %o\n", ia);
		System.out.printf("10진수 = %d\n", ia);
		System.out.printf("16진수 = %x\n", ia);
		System.out.println();
		
		System.out.println("ia =[" + ia + "] " );
		System.out.printf("ia =[%d]%n ", ia );
		System.out.println("-----------------");
		
		System.out.printf("ia = [%9d]\n", ia); // 숫자 9의 의미는 9칸 안에 값을 출력하는 뜻. 즉 데이터가 출력될 전체 자리수가 9라는 뜻.
		System.out.printf("ia = [%-9d]\n", ia); // 숫자 앞에 '-'기호를 붙이면 왼쪽으로 정렬 기본은 오른쪽 정렬
		System.out.printf("ia = [%09d]\n", ia); // 빈자리에 0이 추가된다.
		
		System.out.println("-----------------");
		
		System.out.printf("fb = %f\n", fb);
		System.out.printf("dc = %f\n", dc);
		
		System.out.printf("fb = %e\n", fb);
		System.out.printf("dc = %e\n", dc);
		
		System.out.printf("dc = [%10.2f]\n", dc); // %10.2f 에서 10은 전체자리수 , 2는 소수점 이하 자리수를 의미한다. 단, 전체자리수는 소수점을 포함한 자리수 이다.
		System.out.printf("dc = [%.2f]\n", dc); // 소수점 이하 자리수만 맞춘다.
		
		System.out.printf("dc = [%-10.2f]\n", dc);
		System.out.printf("dc = [%4.2f]\n", dc); // 전체 자리수가 부족하면 이 값을 무시한다.
		
		System.out.println();
		System.out.printf("ch => 코드값 : %d, 문자 : %c\n", (int)ch, ch);
		System.out.printf("논리값 : %d\n", bd);
		
		System.out.printf("문자열 : [%s]\n", str);
		System.out.printf("문자열 : [%10s]\n", str);
		System.out.printf("문자열 : [%-10s]\n", str);
		System.out.printf("문자열 : [%s]\n", str);
		
		System.out.printf("문자열 : [%.3s]", str); // %.3s에서 '.3'은 문자열 중 앞에서 출력할 개수이다. 즉 앞에서 3글자만 출력한다.
		
		
		
	}

}
