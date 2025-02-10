package kr.or.ddit.day16;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("개가 뼈따구를 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("개가 개집에서 자고있다.");
	}

}
