package kr.or.ddit.day14;

import java.util.Scanner;

/*
 	한 제품을 나타내는 Product클래스 작성하기
 	
 	이 제품에는 제품 번호가 있다. 이 제품번호는 제품이 생성될 때마다 
 	자동으로 증가된다.
 	
 
 */

class Prouduct{
	int serialNo;	// 제품번호
	String proName;	// 제품이름
	
	static int count;	// 제품이 생성될 떄마다 값이 증가될 변수
	
	void printProductInfo(){
		System.out.print("제품 번호 : " + serialNo +", 제품명 : " + proName);
		System.out.println();
	}
	
	public Prouduct(String proName) {
		this.proName = proName;
		
	}
	
	{
		count++;
		serialNo = count;
		//serialNo++;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("제품명을 입력하세요.");
		
		Prouduct p1 = new Prouduct("Tv");
		Prouduct p2 = new Prouduct("com");
		Prouduct p3 = new Prouduct("ph");
		
		System.out.println("제품 정보 출력");
		p1.printProductInfo();
		p2.printProductInfo();
		p3.printProductInfo();
		System.out.println();
		//System.out.println("현재까지 만들어진 제품의 갯수 : " + Product.count);

	}

}
