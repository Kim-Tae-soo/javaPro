package _workSpace;

import _workSpace.shoppingMall;
import java.util.*;

public class shoptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shoppingMall user = new shoppingMall();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주문 번호 : ");
		user.setOrdernum(sc.nextLine());
		
		System.out.print("주문자 아이디 : ");
		user.setId(sc.nextLine());
		
		System.out.print("주문 날짜 : ");
		user.setDate(sc.nextLine());
		
		System.out.print("주문자 이름 : ");
		user.setName(sc.nextLine());
		
		System.out.print("주문 상품 번호 : ");
		user.setProdnum(sc.nextLine());
		
		System.out.print("배송 주소 : ");
		user.setAddress(sc.nextLine());
		
		user.orderPrint();
	}

}
