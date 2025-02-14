package kr.or.ddit.day17;

public class javaLang패키지 {
	/*
	java.lang 패키지의 주요 클래스
	
	다른 클래스를 사용하려면 import를 해야 클래스 명을 사용하지 않고 한다고 했음
	java.lang의 패키지가 import가 안되있어도 자동으로 찾을 수 있게 되어있음.
	
	Object ==> 자바의 최상위 객체
	System ==> 키보드 입력, 모니터에 결과 출력 등등 // 컴퓨터, 모니터 ==> 표준 입출력장치
					// 쓰레기 수집기 ==> heap영역에서 사용하지 않고 하는 것을 없애주는 장치
	
	Class ==>
	String ==>
	
	char -> Character
	int -> Integer
	
	-- 포장하는 과정 Wrapper
	박싱 : 기본 타입의 값을 포장 객체로 만드는 과정
	자바 8버전까지는 Byte obj = new Byte(10); 했었음. --> 앞으로 없어질 수 있음. 되도록 사용하지말아라
	각 객체마다 변환하고 싶은 값이 있다면 valueOf()하면 포장해서 Wrapper클래스 객체로 만들어줌
	숫자로 되어있는 문자열을 넣어서 숫자로 변경가능함
	
	문자형태로 되어있는 것들을 포장객체로 넣어주면 포장객체형태로 나오게 됨. 보통은 기본데이터 타입을 객체화 시켜주면 boxing이라고 함
	
	반대로 기본타입을 꺼내오는 것을 unboxing이라고 함.
	
	기본타입이름+Value()메소드 호출해서 언박싱
	원래 데이터를 빼서 타입에 맞춰서 준다
	
	근데 이걸 왜해
	
	이값을 포장하고 가지고 있다가 기본타입형으로 돌려주는듯?
	
	
	포장하는 작업을 프로그래머가 일일히 했었어야했음
	포장클래스 타입에 기본값이 대입될 경우 자동 박싱됨.
	컴파일러가 보았을때 객체로 변환할 수 있는 것이라면 자동으로 포장을 해줌 ==> autoboxing
	기본자료형 자료에 박싱한 값을 넣어주면 자동 언박싱이됨
	String obj = 100;
	int value = obj; --> 원래대로 해석하면 obj가 가지고 있는 참조값을 넣어라 인데 컴파일러가 분석함 맨처음 포장 할때 obj가 wrapper클래스인데 원래 값이 int라고 하면 포장해제해서 넣어주는 것임.  
	
	
	문자열하고 비교하는 것 괄호속에 숫자로 되어있는 문자열을 넣어주면 실제 문자열을 숫자로 바꿔주는 것
	문자열을 각 타입으로 바꿔주는 것이 있음 char형 빼고 다있음
	문자열을 기본타입값으로 변환 다른 타입도 다 변환할 수 있는 명령어가 있다.
	
	주의할점 포장객체는 비교연산자를 사용할때에 ==, !=를 하면 좋지 않음 포장객체의 참조값을 비교하는 것이기 때문에 같은 값을 주었더라도 무조건 false가 나옴
	
	Math 클래스
	수학계산에 사용
	
	abs ==> 절대값, 즉 크기임. 
	
	음수는 절대값이 큰 수가 작은값임.
	ceil ==> 소수점이 들어 가는 것을 넣으면 괄호속의 소수점의 값보다 큰 정수가 나오게됨. 양수 - 올림값 
	floor ==> 소수점이 들어가는 것을 넣으면 괄호속의 소수점의 값보다 작은 정수가 나오게 됨. 양수 - 버림값 
	
	max ==> 최대값
	
	 min ==> 최소값
	 
	 random() ==> 랜덤의 값
	 
	 
	 String 클래스
	 
	 직접 String객체를 생성
	 heap영역안에서도 문자열만 저장되는 공간에 저장이 되어짐. 그곳의 참조값을 가져오게됨.
	 new String으로 만들게 되면 문자열만 저장되는 공간이 아닌 바깥쪽공간에 저장이 되게됨.
	 
	 생성자가 여러개 있음
	 byte[] --> byte 배열 전체를 String으로 생성 ==> 문자를 문자열로 저장
	 
	 지정한 문자열로 디코딩
	new String(byte[] bytes, String charsetName);
	
	//배열의 offset위치까지 
	
	String 객체에서 제공해주는 method들은 거의다 알아야함. 중요함
	중요..!
	*/
}
