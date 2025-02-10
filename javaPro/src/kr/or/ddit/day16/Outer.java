package kr.or.ddit.day16;

public class Outer {

	// 인스턴스 내부 클래스
	class IntancInner{
		int iv = 100;				// 인스턴스 변수
		static int cv = 200;		// static 변수
		final static int sv = 300;	// 상수
	}
	
	// 정적 (static) 내부 클래스
	static class StaticInner{
		int iv = 400;
		static int cv = 500;
		final static int sv = 600;
		
	}
	
	public void myMethod() {
		//Local(지역) 내부 클래스
		class LocalInner{
			int iv = 700;
			static int cv = 800;
			final static int sv = 900;
			
		}
		
		
		// 지역 안에서만 사용이 가능함.
		// 외부에서 사용하기 위해서는 myMethod만 호출해주면 ok
		System.out.println("LocalInner.cv = " +  LocalInner.cv);
		System.out.println("LocalInner.sv = " +  LocalInner.sv);
		
		LocalInner lo = new LocalInner();
		System.out.println("Local 내부 클래스의 인스턴스 변수 iv = " + lo.iv);
		
	}
	

}
