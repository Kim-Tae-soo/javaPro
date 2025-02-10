package kr.or.ddit.day17;

import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) {
		new ThrowsTest().method01();
		System.exit(0); // 프로그램 정지
		System.out.println("main()메서드 끝..");

	}
	
	public void method01() {
		try {
			method02();
		} catch (IOException e) {
			System.out.println("method01()에서 IOException 처리...");
		} catch (Exception e) {
		System.out.println("method01()에서 모든 예외 처리...");
	    }
		System.out.println("method01() 끝..");
	}
	public void method02() throws IOException {
		System.out.println("method02() 시작...........");
		// 여기에서도 처리 가능함.
		try {
			int a = 100/0;
		} catch (ArithmeticException e) {
			System.out.println("method02()메서드에서 예외 처리하기");
			System.out.println("e => " + e); // 오류 맨 윗줄 출력
			System.out.println("toString() ==> " + e.toString()); // 오류 맨 윗줄 출력
			System.out.println("getMessage() ==> " + e.getMessage()); //: 뒤에 출력
			e.printStackTrace(); // 전체 오류 메세지 출력
		}
		
		throw new IOException("method02()에서 발생한 IOexception..");
	}
	

}
