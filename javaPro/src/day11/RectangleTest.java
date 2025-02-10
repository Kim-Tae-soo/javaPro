package day11;

import java.util.Scanner;

/*
 	4각형 도형을 나타내는 class를 만드시오. (클래스명 : Rectangle)
 	
 	이 class는 사격형의 가로(너비), 세로(높이) 길이를 저장하는 속성과
 	면적을 구하는 기능이 있다.
 
 */

class Rectangle{
	int width;		//가로 (너비)
	int height;		//세로 (높이)

	int getArea() { // 면적을 구해서 반환하는 메서드
		return width * height;
	}
}

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		
		rect.width = 20;
		rect.height = 30;
		
		int area = rect.getArea();
		
		System.out.println("가로 : " + rect.width);
		System.out.println("가로 : " + rect.height);
		System.out.println("가로 : " + area);
		
	}

}
