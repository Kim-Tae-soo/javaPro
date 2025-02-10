package day01;

public class Ch02ex01 {

	public static void main(String[] args) {
		// 변수의 명명 규칙
		
		// 1.대소문자 구분
		int num = 3;
		int Num = 4;
		num = 5;
		
		// 2. 예약어 (keyword , reserved word  등 선언하는 단어) 는 사용할 수 없다
		// ex ) int void => 사용 불가
		
		// 3. 숫자로 시작하는 변수명은 사용할 수 없다.
		// ex ) int 1num => 사용 불가
		
		// 4. 변수명에 사용할 수 있는 특수문자는 '$' 와  '_' 만 사용할 수 있다.
		
		// ex ) int #test => 사용 불가 int $test => 사용 가능
		int $harp = 10;
		int test_22 = 100;
		
		/*
		 * 프로그래머 사이의 암묵적인 약속들..
		 * 1. 클래스명은 첫 글자를 대문자로 한다.
		 * 		변수명과 메서드명은 첫 글자를 소문자로 한다.
		 * 2. 여러 단어로 이루어진 이름은 '낙타 표기법'으로 기술한다.
		 * ex ) int lastOfIndex => 변수명의 처음은 소문자로 기술하나 뜻이 추가되는 단어는 대문자로 기술한다.
		 * ex ) int last_of_index => 이렇게 표기를 하는 경우도 있음.
		 * */
		
		int lastOfIndex = 0;
		int last_of_index = 0;
	
		// 3. 상수의 이름은 대문자로 한다. (상수 --> 변경이 되지 않음)
		final int LAST_OF_INDEX = 9;
		// 단어가 여러개일 경우 확인하기 편하기 위해 '_'를 사용 붙여서 써도 상관 없음. final이 붙으면 상수라고 생각하면 됌.
		
	}
}