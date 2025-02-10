package kr.or.ddit.day16;

public class InnerTest01 {

	public static void main(String[] args) {
		// 인스턴스 내부 클래스의 static 변수와 final static 변수 (직접 접근하여 출력이 가능함)
		System.out.println(Outer.IntancInner.cv);
		Outer.IntancInner.cv = 1000;
		System.out.println(Outer.IntancInner.cv);
//		Outer.IntancInner.sv = 1000; // final 변수는 변경이 불가함.
		System.out.println(Outer.IntancInner.sv);
		
		System.out.println("---------------------------------------------------------");
		
		// static 내부 클래스의 static 변수와 final static 변수 인스턴스 변수 X
		System.out.println(Outer.StaticInner.cv);
		System.out.println(Outer.StaticInner.sv);
		
		System.out.println("---------------------------------------------------------");
		
		/*
		  	인스턴스 내부 클래스를 외부에서 생성하려면 외부 클래스에 대한 인스턴스를 먼저 생성한 후
		  	생성된 외부클래스의 참조변수를 이용하여 객체를 생성할 수 있다.
		 */
		
		Outer oc = new Outer();			// 외부 클래스의 인스턴스 생성
		
		// 외부 클래스의 참조변수를 이용하여 내부 클래스의 객체를 생성한다. ex)외부클래스의 참조변수.new
		Outer.IntancInner ic = oc.new IntancInner();
		System.out.println("인스턴스 내부 클래스의 인스턴스 변수 iv = " + ic.iv);
		System.out.println("---------------------------------------------------------");
		
		/*
		  static 내부 클래스의 인스턴스(객체) 생성하기
		  형식 ) 외부클래스이름.static내부클래스이름 변수명 = new.외부클래스이름.static내부클래스명()
		 */
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("static 내부 클래스의 인스턴스 변수 iv = " + si.iv);
		System.out.println("---------------------------------------------------------");
		
		
		System.out.println("Local 내부클래스가 있는 메서드 호출....");
		oc.myMethod();

	}

}
