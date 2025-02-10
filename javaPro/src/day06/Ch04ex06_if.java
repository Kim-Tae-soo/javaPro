package day06;

import java.util.Scanner;

public class Ch04ex06_if {

	public static void main(String[] args) {
		/*
		 * 두 사람의 가위, 바위, 보를 각각 입력 받아 승패를 판정하는 프로그램을 작성하시오.
		 * 
		 * 입력 예) 첫번째 사람의 가위 바위 보를 입력하세요 >> 두번째 사람의 가위 바위 보를 입력하세요 >>
		 * 
		 * 출력 예) 첫번째 사람 : 가위 두번쨰 사람 : 보 판정 결과 : 첫번째 사람 승!
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		String user1;
		String user2;

		do {
			System.out.println("첫번째 사람의 가위 바위 보를 입력하세요 >>");
			user1 = scan.next();
			if (!(user1.equals("가위") || user1.equals("바위") || user1.equals("보"))) {
				System.out.println("정확하게 가위 바위 보를 입력하세요");
				System.out.println("");
			}
		} while (!(user1.equals("가위") || user1.equals("바위") || user1.equals("보")));

		do {
			System.out.println("두번째 사람의 가위 바위 보를 입력하세요 >>");
			user2 = scan.next();
			if (!(user2.equals("가위") || user2.equals("바위") || user2.equals("보"))) {
				System.out.println("정확하게 가위 바위 보를 입력하세요");
				System.out.println("");
			}

		} while (!user2.equals("가위") && !user2.equals("바위") && !user2.equals("보"));

		String result = "";

		if (user1.endsWith(user2)) {
			result = "DRAW";

		} else if (user1.equals("가위") && user2.equals("보") || user1.equals("바위") && user2.equals("가위")
				|| user1.equals("보") && user2.equals("바위")) {
			result = "USER1 WIN !!";

		} else {
			result = "USER2 WIN !!";
		}

		System.out.println();
		System.out.println("USER1 : " + user1);
		System.out.println("USER2 : " + user2);
		System.out.println("WIN OR LOSE : " + result);
	}

}
