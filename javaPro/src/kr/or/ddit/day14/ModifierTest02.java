package kr.or.ddit.day14;

/*
	- final
		==> 변수 앞에 사용하여 상수를 선언할 때 사용
		
	- 상수를 초기화 하는 방법
	1) 변수 선언과 동시에 초기화 하는 방법
	2) 초기화 블럭에서 초기화 하는 방법
	
*/
public class ModifierTest02 {
	
	final int NUMBER = 100;	// 1번 방법
	final String KIND;		// 2번 방법
	final int SCORE;		// 3번 방법
	
	final static int WIDTH = 10;	// 초기화 1번 방법 (static 사용)
	final static int HEIGTH;		// 초기화 2번 방법 (static 사용)
	final static int AREA;			// 
	
	//fianle static 을 초기화 하려면 static 블록에서 진행을 해야함
	//클래스 (정적) 초기화 블럭
	//	==> final static 변수를 초기화 할 수 있다.
	static{
		AREA = 200;
		HEIGTH = 200; // 초기화 2번방법 (static)
	}
	
	//인스턴스 초기화 블럭
	// ==> final  인스턴스 변수를 초기화 할 수 있다.
	{
		// NUMBER = 200; // 상수는 초기화 이후에 값을 변경할 수 없다.
		KIND = "하트";	// 2번방법 초기화 블럭에서 초기화를 해주는 방법 
	}
	
	
	//생성자 메소드
	public ModifierTest02() {
		SCORE = 1000;	// 초기화 3번방법 생성자 메소드에서도 할 수 있다.
		//AREA = 200;		// fianl static 변수는 생성자 메소드에서는 초기화 할 수 없다
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
