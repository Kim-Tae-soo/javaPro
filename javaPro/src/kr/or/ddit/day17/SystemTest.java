package kr.or.ddit.day17;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class SystemTest {

	public static void main(String[] args) {
		/*		
		// 기준시간 ==> 1970년 1월 1일 0시 0분 0초
		// 기준시간부터 현재 시간 까지 경과한 시간을 밀리세컨드로 반환한다.
		// 밀리세컨드(1/1000초)
		System.out.println(System.currentTimeMillis());
		
		System.out.println(System.nanoTime());
		
//		문자열.splite("구분문자열")
//		==> '문자열'을 '구분문자열'로 분리하고 분리된 데이터를 배열에 담아서 반환한다.
//			관련 예제는 교재 506p부터 520p까지 있음. 남은 시간은 예제를 직접 입력해서 실행하기 000000000
		String str = "홍길동,이순신,강감찬,을지문덕";
		String[] result = str.split(","); 
//		문자열.split(" ") ==> " " 을 기준으로 따로 따로 각각 구분하여 문자열을 나눠준다.
		
*/
		// byte 배열을 문자열로 반환
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		// 아스킷코드로 저장된 문자들을 문자열로변경해서 출력 
		String str1= new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		// 바이트 배열을 문자열로 반환
		byte[] bytes1 = new byte[100];
		try {
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes1);	
		String str = new String(bytes,0,readByteNo-2);
		System.out.println(str);
		// 이것을 사용하면 오류가 나는데 IOException오류가 날수도 있는 상황이 생김. 그래서 try-catch 를해주거나 메인메서드에 throw IOException를 해줘야지 오류가 안남.
		// 숫자를 입력시 byte로 입력받아오는데 그것은 아스킷코드로 변환가능
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		// 문자추출
		
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
			switch(sex) {
				case '1' :
				case '3' : 
					System.out.println("남자 입니다.");
					break;
				case '2' : 
				case '4' : 
					System.out.println("여자 입니다.");
					break;
			}
		
		// 문자열 비교
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체 참조");
		}else {
			System.out.println("다른 String 객체 참조");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐.");
		}else {
			System.out.println("다른 문자열을 가짐.");
		}	
			
		// 바이트 배열로 변환
		String str3 = "안녕하세요.";
		byte[] bytes2 = str3.getBytes();
		System.out.println("bytes2.length : " + bytes2.length);
		String str4 = new String(bytes2);
		System.out.println("bytes2 -> String : " + str4 );
		
		
		try {
			byte[] bytes3 = str3.getBytes("EUC-KR");
			System.out.println("bytes3.length : " + bytes3.length);
			String str5 = new String(bytes3,"EUC-KR");
			System.out.println("bytes3 -> String : " + str5 );
			// EUC-KR은 한글을 2byte로 변환시켜줌.
			// 그래서 각각의 값이 다르게 나오는 것임.
			
			byte[] bytes4 = str3.getBytes("UTF-8");
			System.out.println("bytes3.length : " + bytes4.length);
			String str6 = new String(bytes4,"UTF-8");
			System.out.println("bytes3 -> String : " + str6 );
			// UTF-8은 한글을 3byte로 변환시켜줌.
		
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		String subject = "자바프로그래밍";
		
		
	}

}