package day02;

public class Ch02ex04 {

	public static void main(String[] args) {
		
		/* 문자 데이터 
		 * 
		 * 문자 데이터는 작은 따옴표를 사용하여 나타낸다.
		 * char형 변수에 저장되는 값은 해당 문자의 코드 값이 저장된다.
		 * 대문자 A의 코드값은 65이다.
		 * 
		 * */
		
		char ch;
		ch =  'A';
		int a = ch; // 자동 형변환
		
		char ch2 = 66;
		
		System.out.println("ch = " + ch);
		System.out.println("a = " + a);
		System.out.println("ch2 = " + ch2);
		
		/* 
		 * 종류가 다른 데이터를 저장하려면 저장하려는 데이터를 변수의 자료형에 맞게 변환 후에 저장해야 한다.
		 * 형식 ) (변환할 자료형의 이름) 변수
		 * 		위 형식에서 괄호속에 지정한 '변환할 자료형의 이름'을 '캐스트(cast)연산' 이라고 한다.
		 *  
		 */
		
		a = 97;  // 영어 소문자의 코드값이 97이다.
		ch2 = (char) a;
		System.out.println("ch2 = " + ch2);
		
		// 문자형과 문자열의 빈문자 초기화 방법
		String str = "";
		char ch3 = ' ';
		
		// 
		System.out.println("----------------------");
		
		/*
		 *
		 * 특수문자나 기능이 있는 문자를 나타내는 방법
		 * 
		 * ( 역슬래쉬(\)를 사용하여 나타낸다. )
		 * 
		 * \n ==> 줄바꿈
		 * \r ==> 캐리지리턴 ( 그 줄 맨 앞으로 커사 이동 )
		 * \t ==> Tab key 만큼 공백이 생김
		 * \" ==> 큰 따옴표 문자 (")
		 * \' ==> 작은 따옴표 문자 (')
		 * \\ ==> \ 문자
		 * 
		 */
		
		System.out.print("안녕하세요.\n");
		System.out.println("반갑\t습니다."); 
		System.out.println("안녕\r하세요"); // ==> \r 줄바꿈(\n) 느낌
		System.out.println();
		System.out.println("역슬래쉬 ==> \\ ");
		System.out.println("나는 \"홍길동\"이다.");
		System.out.println("나는 \'홍길동\'이다.");
		System.out.println('\'');
		// System.out.println("나는 "홍길동"이다.");  ==> 이건 오류 발생
		// System.out.println("나는 '홍길동'이다.");  ==> 이건 오류 발생 안함
		
		
		System.out.println("유니코드 표기 : " + '\u0041');
		/*
		 * 유니코드 표기는 '\\u코드값' 으로 나타낸다.
		 * 	==> 코드값은 16진수 4자리로 표기한다.
		 */
	}

}
