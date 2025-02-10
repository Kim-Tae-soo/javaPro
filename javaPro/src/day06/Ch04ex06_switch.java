package day06;

import java.util.Scanner;

public class Ch04ex06_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		
		switch (user1 + user2 ) {
		
		case "가위가위" :
		case "바위바위" :
		case "보보" :
			result = "DRAW";
			break;
		case "가위보" :
		case "바위가위" :
		case "보바위" :
			result = "USER1" + " WIN!!";
			break;
		default:
			result = "USER2" + " WIN!!";
				
		}

		System.out.println();
		System.out.println("USER1 : " + user1);
		System.out.println("USER2 : " + user2);
		System.out.println("WIN OR LOSE : " + result);
	}

}
