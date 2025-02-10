package day13;

import java.util.Iterator;
import kr.or.ddit.day13.*;

/*
	접근제한자 ****
	- public		==> 아무곳에서나 접근 가능
	- protected		==>	자식 클래스와 같은 package에 있는 클래스에서 사용 가능
	- private		==>	자신 클래스 내에서만 사용 가능
	- 아무것도 지정하지 않는것 ==> default ==>	같은 package에 있는 클래스에서 사용 가능
*/
class Time {
	// 단축이 변수 이름 뒤에 alt+shift+s
	private int hour; // 시간 private
	private int minute; // 분 private
	int second; // 초 default

	// 외부에서 메소드를 통해 private 변수에 접근할 수 있도록 해야 한다.
	// getter(값을 불러옴) , setter (값을 세팅함)

	// 외부에서 hour에 새로운 데이터를 저장하는 메서드
	public void setHour(int h) {
		if (h < 0 || h > 23) {
			System.out.println("hour는 0 ~ 23 사이의 값만 사용가능합니다.");
			return;
		}
		hour = h;
	}

	// 외부에서 hour변수의 값을 읽어가는 메서드
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}


}

public class ModifierTest {

	public static void main(String[] args) {
		Time t = new Time();

//		t.hour = 3; // 위의 time class에서 private로 선언을 하였기 떄문에 서로 다른 클래스에서는 사용할 수 없다.
		t.second = 30; // 위의 time class에서 default로 선언이 되어있기 때문에 같은 패키지에서 사용이 가능하다.
		t.setHour(23);

		System.out.println("시 : " + t.getHour() + "시");
		
		System.out.println("----------------------------------------------------");
		
		/*
		 	package에 작성된 클래스를 사용하려면 '패키지명.클래스명'과 같은 형식으로 사용해야 한다.
		 	
		 	import 명령으로 미리 패키지를 등록해 놓으면 패키지명을 생략하고 사용할 수 있다.
		 	
		 */
		Tv myTv01 = new Tv();
		
		// default 접근제한자는 다른패키지에서는 접근이 불가능하다.
//		myTv01.color = "검정색"; 	// 접근불가
//		myTv01.powerOnOff();	// 접근불가
		
		// public 접근제한자는 제한 없이 접근이 가능하다.
		
		myTv01.channel =11;
		myTv01.channelUp();
		System.out.println("채널 : " + myTv01.channel);
		
	}
}
