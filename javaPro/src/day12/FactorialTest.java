package day12;

// 재귀 호출 메소드 ==> 자기 자신 메소드를 호출하는 메소드
/*
	5!	==> 5 * 4 * 3 * 2 * 1
 		==> 5 * 4!
 		==>     4 * 3!
 		==>			3 * 2!
 		==>				2 * 1!
 		==>					1	
 */

public class FactorialTest {

	// factorial을 구하는 재귀 호출 메서드 구현
	static int factorial(int num) {
		if (num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

	int factorial2(int num) {
		if (num == 1) {
			return 1;

		} else {
			return num * factorial2(num - 1);
		}
	}

	public static void main(String[] args) {

		int result = factorial(5);
		System.out.println(result);

		FactorialTest test = new FactorialTest();
		result = test.factorial2(6);
		System.out.println(result);

	}

}
