package kr.or.ddit.day16;
/*
 	메세지를 보내는 작업을 수행하는 프로그램을 작성하려고 한다.
 	메세지를 보내는 방법은 '문자메세지' 보내기, '이메일'로 메세지 보내기 등이 있다.
 */

abstract class MessageSender{
	// 메세지를 보내는 일을 하는 메소드
	abstract void send(String message);
	
}

// 문자메세지를 전송하는 클래스
class SMSSender extends MessageSender{
	String senderTel;
	String receiverTel;
	
	public SMSSender(String senderTel, String receiverTel) {
		super();
		this.senderTel = senderTel;
		this.receiverTel = receiverTel;
	}
	
	@Override
	void send(String message) {
		System.out.println("-------------------------");
		System.out.println("보내는 사람 : " + senderTel);
		System.out.println("받는 사람 : " + receiverTel);
		System.out.println("내 용 : " + message);
		System.out.println("-------------------------");
		System.out.println();
	}
}
//이메일 전송용 클래스
class EmailSender extends MessageSender{
	String senderEmail;		// 보내는 사람의 이메일 주소
	String receiverEmail;	// 받는 사람의 이메일 주소
	
	public EmailSender(String senderEmail, String receiverEmail) {
		super();
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
	}
	@Override
	void send(String message) {
		System.out.println("-------------------------");
		System.out.println("보내는 E-mail : " + senderEmail);
		System.out.println("받는 E-mail : " + receiverEmail);
		System.out.println("내 용 : " + message);
		System.out.println("-------------------------");
		System.out.println();
	}
	
}

// -----------------------------
interface Player{
	//source를 재생하는 메서드
	void play(String source);
	
	//재상을 멈추는 메서드
	void stop();
}

// ----------------------------

public class SenderTest {

	public static void main(String[] args) {
		// 일반적인 방법
		SMSSender sms = new SMSSender("010-1111-1111", "010-2222-2222");
		sms.send("배고파");
		System.out.println();
		
		EmailSender email = new EmailSender("aba@naver.com", "bbc@naver.com");
		email.send("배고파");
		
		// -----------------------------------
		// 내부 클래스를 만들어서 처리하기
		// 예) 위성과의 메세지 전송
		class SateSender extends MessageSender{
			
			@Override
			void send(String message) {
				System.out.println("---------------------");
				System.out.println("발신 : 화성3호");
				System.out.println("수신 : 도지코인");
				System.out.println("내용 : " + message);
				System.out.println("---------------------");
				System.out.println();
			}
		}
		
		SateSender ss = new SateSender();
		SateSender ss2 = new SateSender();
		ss.send("멸망");
		System.out.println();
		
		//------------------------------------------
		/*
		 	익명 구현체(객체)를 이용하는 방법
		 		==> 1회성 객체를 생성해서 사용할 때 만든다.
		 	형식1) 조상클래스명 변수명 = new 조상클래스명(인자값들...){
		 			조상클래스를 상속 받아서 처리할 내용들...
		 			...
		 			...
		 		}
		 	형식2) 인터페이스명 변수명 = new 인터페이스명(){
		 			인터페이스의 메서드들을 구현해 놓는다.
		 	}
		 	
		 */
		MessageSender ms = new MessageSender() {
			
			@Override
			void send(String message) {
				System.out.println("---------------------");
				System.out.println("발신 : 화성33호");
				System.out.println("수신 : 도지코인");
				System.out.println("내용 : " + message);
				System.out.println("---------------------");
				System.out.println();
				
			}
		};
		ms.send("으아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
		System.out.println();
		
		// 인터페이스를 이용한 익명 구현체 만들기
		Player test = new Player() {
			
			@Override
			public void stop() {
				System.out.println("재생을 멈췄습니달");
				
			}
			
			@Override
			public void play(String source) {
				// TODO Auto-generated method stub
				System.out.println(source + "를 재생합니다.");
			}
		};
		
		test.play("집에가는길.mp3");
		test.stop();

	}

}
