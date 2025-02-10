package day02;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch02ex06 {

	public static void main(String[] args) throws IOException {
		// 키보드로 입력 받는 방법들...
		
		/*
		 * 1. byte 단위로 입력 받기
		 * 명령어 : System.in.read(); ==> 키보드로부터 1byte를 입력받아 int형으로 변환한다.
		 
		
		System.out.print("성별을 입력하세요 (남자 : M , 여자 : F)");
		// int gender = System.in.read(); 코드값 숫자로 표기
		char gender = (char)System.in.read();
		
		System.out.println("입력 받은 문자 : " + gender);
		System.out.println("입력 받은 코드값 : " + (int)gender);
		
		*/
		
		///////////////////////////////////////////////////////////////////////
		
		/*
		 * 2. 문자 단위로 입력 받기
		
		
		System.out.printf("성별을 입력하세요 (남,여)");
		InputStreamReader reader = new InputStreamReader(System.in);
		char gender2 = (char)reader.read();
		
		System.out.println("입력 받은 문자 : " + gender2);
		System.out.println("입력 받은 코드값 : " + (int)gender2);
		
		 */
		
		/*
		 * 3. Scanner 객체를 이용한 자료 입력 받기 ( 정수 , 실수 , 문자열 입력 받기 가능 )
		 * Scanner는 토큰 단위로 자료를 읽어온다.
		 * 보통 토큰은 사이띄기, 줄바꿈 , tab문자로 구분된 데이터를 의미한다.
		 * 
		 * ex) 홍길동		40 3.14 대전
		 * 위의 예씨는 총 4개의 토큰으로 구분된다.
		 * < 구분되는 토큰 4가지 >
		 * 홍길동
		 * 40
		 * 3.14
		 * 대전
		 * 
		 * <사용 방법>
		 * */
		
		Scanner scan = new Scanner(System.in); // Scanner 객체를 생성
		
		/*
		System.out.print("성별을 입력하세요. (남자,여자)");
		String gender3 = scan.next(); // 띄어쓰기가 없는 문자열을 입력받을때 사용하는 명령어 scan.next()
		System.out.println("입력 받은 값 : " + gender3);
		
		scan.close(); // 자원 반납 크게 중요하지는 않다.
		
		* Scanner로 자료형에 맞게 입력 받기
		* 형식) scna.next(자료형) ex) Int , Double , Float ...
		* */
		
		/*
		 * 토큰 단위로 입력 받기 
		 */
		System.out.print("이름, 나이, 몸무게를 차례로 입력 하세요 >> \n");
		// 키보드로 입력받은 임시 저장소 버퍼에서 scan.next 명령어를 통해 데이터를 하나씩 가져옴
		String name = scan.next();
		int age = scan.nextInt();
		float weight = scan.nextFloat();
		
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
		System.out.println("몸무게 : " +weight);
	}

}
