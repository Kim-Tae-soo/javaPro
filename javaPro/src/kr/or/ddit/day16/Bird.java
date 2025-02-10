package kr.or.ddit.day16;

public class Bird implements Animal {

	@Override
	public void eat() {
		System.out.println("새가 씨앗을 먹고 있다.");
	}

	@Override
	public void sleep() {
		System.out.println("새가 나무 위에서 자고 있다.");
	}

}
