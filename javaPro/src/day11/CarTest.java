package day11;

import java.util.*;

/*
 	Car 클래스를 작성하시오.
 	1) 속성 : 차종, 속도
 	2) 기능 : 
 		- 멈춘다 ==> 속도를 0으로 감소시킨다.
 		- 가속하다 ==> 가속할 양을 매개변수로 받아서 속도를 가속할 양만큼 증가시킨다.
 		- 현재 속도 반환하기
 		- 차종 반환하기
 */

class Car {
	
	int speed;	// 속도
	String model; // 차종
	
	// 멈춤
	void stop() {
		speed = 0;
	}
	
	// 가속
	void speedUp(int up) {
		speed += up;
	}
	
	// 현재 속도 반환하기
	int getSpeed() {
		return speed;
	}
	
	//차종 반환하기
	String getModel() {
		return model;
	}

}

public class CarTest {
		
	public static void main(String[] args) {
		//Car 클래스 사용하기
		Car myCar = new Car();
		
		//차종 정하기
		myCar.model = "마티즈";
		
		// System.out.println("차종 : " + myCar.model); 1번방법
		System.out.println("차종 : " + myCar.getModel());
		System.out.println();
		
		System.out.println("처음 속도 : " + myCar.getSpeed()+"km");
		
		myCar.speedUp(100);
		//System.out.println("현재 속도 : " + myCar.speed+"km"); 1번방법
		System.out.println("현재 속도 : " + myCar.getSpeed()+"km");
		
		myCar.stop();
		//System.out.println("현재 속도 : " + myCar.speed+"km"); 1번방법
		System.out.println("현재 속도 : " + myCar.getSpeed()+"km");
	
	}
}
