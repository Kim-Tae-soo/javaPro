package kr.or.ddit.day17;

import java.util.Scanner;

/*
	예외를 강제적으로 발생 시키기
	형식) throw new 에외객체클래스명();
*/
public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 >> ");
		int x = sc.nextInt();
		try {
			if(x==0) {
//				System.out.println("0은 사용할 수 없습니다.");
//				return;보통 우리가 했던 것은 이렇게 작성 했었음.
				throw new Exception("0은 사용할 수 없습니다."); // 발생한 오류를 캐치한테 넘겨줌. 이렇게 하면 메세지를 이렇게 나오게 해줌. // 사용자가 exception을 나오게해서  처리하는 방법 
			} 
			int y = 100 / x;
		
			System.out.println("y = " + y);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			// 메세지를 내맘대로 구성해서 넣고싶음
			
		}
	}

}
