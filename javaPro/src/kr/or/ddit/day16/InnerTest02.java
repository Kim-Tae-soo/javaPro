package kr.or.ddit.day16;

class Outer02{
	int value = 100;
	int test01 = 1000;
	
	class Inner{ // 인스턴스 inner 바깥쪽과 안쪽의 변수명이 같을 때 어떻게 처리되는가.. 저도 몰라요
		int value = 200;
		int test02 = 2000;
		
		void myMethod() {
			// 지역
			int value = 300;
			
			System.out.println("각 위치별 변수명이 중복될 때...");
			
			// 지역변수
			System.out.println("value = " + value); // myMethod 해당
			
			// 내부 클래스의 멤버변수
			System.out.println("this.value = " + this.value); // Inner클래스에 해당
			
			// 외부 클래스의 멤버변수
			System.out.println("Outer02.this.value = " + Outer02.this.value); // 바깥쪽 Outer02 해당
			System.out.println("--------------------------------------------------------");
			System.out.println("변수명이 중복되지 않을 때...");
			System.out.println("test01 = " + test01);
			System.out.println("test02 = " + test02);
			
		}
		
	}
}

public class InnerTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer02 oc = new Outer02();
		Outer02.Inner ii = oc.new Inner();
		
		ii.myMethod();

	}

}
