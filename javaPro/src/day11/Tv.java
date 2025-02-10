package day11;

// 프로그램에서 사용할  필요한 속성 (메서드) 만 구성해서 넣으면 된다. 나중에 추가해도됌 
public class Tv {
	/*
		속성 	==> 필드, 멤버변수, 전용변수라고 부른다.
		   	==> 클래스 내부, 메서드 외부에 선언한다.
		   	==> 멤버변수(속성)들은 초기화하지 않으면 자동으로 초기화가 된다.
		   		(숫자형(정수,실수 다 포함) : 0, 참조형 : null, 논리형 : false) 로 초기화가 된다.
		   	==> 객체의 데이터적인 부분을 저장하는 역할을 한다.
		   	
		지역변수 ==> 메서드 배부에서 만들어진 변수
				(메서드의 매개변수도 지역번수이다.)
	*/
	
	String color;		// 색상
	boolean power;		// 전원 상태 ( 두개를 비교 t/f )
	int channel;		// 채널
	
	/*
	 	메서드 ==> 전용 함수 라고도한다
	 		 ==> 객체의 기능적인 부분을 처리하는 역할을 한다.
	 		 
	 */
	// 메서드 선언 및 구현
	
	void powerOnOff() { //파워가 켜졌을떄 true 꺼졌을떄 false
		
		/* 방법1 : 조건문
		if(power==true) {
			power = false;
		}else {
			power = true;
		}
		*/
		
		//방법2
		power = !power; // 현재의 반대값을 만들어 저장하기
	}
	
	void channelUp() { // 채널을 올리는 기능
		channel++;
	}
	
	void channeDown() { // 채널을 내리는 기능
		channel--;
	}
	
}
