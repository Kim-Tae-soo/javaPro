package kr.or.ddit.day17;
/*
	try ~ catch ~ finally 구문 사용하기
	
	try 블럭에는 예외가 발생할 가능성이 있는 코드를 넣는다
	
	예외가 발생하면 그 지점에서 명령의 수행이 중단되고, catch 블럭들 중에서 발생한 예외와 같은 타입의 예외가 있는지 찾고, 만약 있다면 그 catch블럭의 명령들을 처리하고, 없다면 프로그램의 실행이 중단된다.
	
	finally 블럭은 예외가 발생하든 하지않든 항상 마지막에 처리되는 블럭이다.
	
	catch블럭에서 처리할 것을 찾지 못해도 finally 블럭은 항상 처리된다.
	try블럭이나 catch블럭에 return 문이 있으면 return문이 처리되기 전에  finally블럭이 먼저 처리된 후 return문이 처리된다.
*/

public class TryCatchFinalilyTest {
	
	public static void main(String[] args) {
		String str = "가나다라";
//		String str = null;
		try {
		System.out.println("글자수 : " + str.length()); //오류가 만들어짐 null값이기 때문에
		System.out.println(5/0);		
		System.out.println("안녕하세요.");
		}catch(NullPointerException e) {
			System.out.println("Null 포인트 예외 발생...");
			System.out.println("getMessage() ==> " + e.getMessage()); // 에러메세지를 띄우는 것임.
			e.printStackTrace(); // 어디에서 에러가 발생했는지 추적할 수 있는 메세지를 보냄 화면상의 오류메세지 처럼 보이게 됨. 
//			둘 중 어떠한 것을 사용할 것인지는 사용자에게 어떻게 알려줄건지 선택사항임
		}catch(ArithmeticException e) {
			System.out.println("산술계산 예외 발생");
			return;
		}catch(Exception e) {
			System.out.println("Exception 예외 발생 => " + e.getMessage());

		}finally{
			System.out.println("finally 영역 입니다.");
		}
		System.out.println("프로그램 끝..");
	
// return이 있어도 fianlly를 먼저 실행하고 return 됨.
	}
	
}
