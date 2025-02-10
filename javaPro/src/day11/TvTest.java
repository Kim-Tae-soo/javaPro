package day11;


//실행 메서드
public class TvTest {

	public static void main(String[] args) {
	/*
		- 객체 참조형 변수 선언하기
		형식) 클래스명 참조변수명;
		
	*/	
		// Tv객체의 참조형 변수 선언
		Tv t;	// 변수't'는 'Tv 객체의 참조형 변수'라고 부르고 'Tv인스턴스(객체)'의 참조값이 저장될 변수이다.
	/*
		- 인스턴스를 생성하고 그 주소(참조값)를 참조형 변수에 저장하기
		형식) 참조변수명 = new 클래스명(); 
	*/
		t = new Tv(); // Tv클래스를 이용하여 'Tv 인스턴스'가 생성되된 'Tv 인스턴스'의 주소(참조값)가(이) 변수 't'에 저장된다.
		
	/*
		- 인스턴스 영역의 자원(속성들 또는 메서드들)을 사용하기
		형식)
			참조변수명.속성명 = 값;			// 'Tv 인스턴스'의 속성에 '값'을 저장하기
			참조변수명.메서드명(인자값들...);	// '인스턴스'의 메서드 호출하기
	 */
		
		// Tv 인스턴스 영역의 power값 출력하기
		System.out.println("t.power ==> " + t.power );
		
		t.powerOnOff();
		
		System.out.println("powerOnoff()메서드 실행 후 t.power ==> " + t.power);
		System.out.println();
		
		System.out.println("현재 채널 : " + t.channel +"번" ); // 메서드 호출 전
		t.channelUp(); // ChannelUp 메소드 호출
		System.out.println("현재 채널 : " + t.channel +"번" ); // 메소드 호출 후
		System.out.println("-------------------------------------------");
		
		Tv t2 = new Tv(); // t2 (참조형변수) Tv 초기화 및 생성
		t2.channel = 7;
		System.out.println("현재 1채널 : " + t.channel +"번" );
		System.out.println("현재 2채널 : " + t2.channel +"번" );
		System.out.println();
		
		t2.channeDown();
		System.out.println("t2.channelDown() 메소드 호출 후 " );
		System.out.println("현재 1채널 : " + t.channel +"번" );
		System.out.println("현재 2채널 : " + t2.channel +"번" );
		System.out.println();
		
		t.channelUp();
		System.out.println("t.channelUp() 메소드 호출 후 " );
		System.out.println("현재 1채널 : " + t.channel +"번" );
		System.out.println("현재 2채널 : " + t2.channel +"번" );
		System.out.println();
		
		t = t2;
		System.out.println("t = t2; 명령 후 " );
		System.out.println("현재 1채널 : " + t.channel +"번" );
		System.out.println("현재 2채널 : " + t2.channel +"번" );
		System.out.println();
		
		t.channeDown();
		System.out.println("t.channelDown() 메소드 호출 후 " );
		System.out.println("현재 1채널 : " + t.channel +"번" );
		System.out.println("현재 2채널 : " + t2.channel +"번" );
		System.out.println();
		
	}

}
