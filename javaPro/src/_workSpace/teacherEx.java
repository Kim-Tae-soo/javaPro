package _workSpace;

import java.util.Scanner;

public class teacherEx {

	public static boolean cheackNum(String str) {
		// 문자열을 정수로 변환 시도후에 변환이 성공하면 true 실패시 false 반환 ==> 예외처리방법 (예외처리 공부 조금 더 하기)
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException a) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentFloor = 1;

		while (true) {
			System.out.print("이동하실 층(1-10)을 입력하세요 ('하차'입력 시 엘리베이터에서 내리게 됩니다.) : ");
			String input = scanner.nextLine();

			if (input.equals("하차")) {
				System.out.println("엘리베이터에서 내렸습니다.");
				break;
			}

			if (cheackNum(input)) {
				int floor = Integer.parseInt(input); // 입력받은 문자열을 정수로 변환 integer 사용

				if (floor < 1 || floor > 10) {
					System.out.println("1층보다 낮은 층이나 10층보다 높은 층은 운영하지 않습니다. 다시 입력해주세요.");
				} else {
					if (currentFloor < floor) {
						for (int i = currentFloor + 1; i <= floor; i++) {
							System.out.println("올라가는 중입니다.. 현재 층 >> " + i + "층");
						}
					} else if (currentFloor > floor) {
						for (int i = currentFloor - 1; i >= floor; i--) {
							System.out.println("내려가는 중입니다.. 현재 층 >> " + i + "층");
						}
					}
					currentFloor = floor; // 현재 층 업데이트

					if (currentFloor == 10) {
						System.out.println(currentFloor + "층 사장실에 도착했습니다. \n프로그램이 종료됩니다.");
						break;
					} else {
						System.out.println("도착했습니다. 현재 층은 " + floor + "층입니다.");
					}
				}
			} else {
				System.out.println("잘못된 입력입니다. 숫자 또는 '하차'만 입력해주세요.");
			}
		}
		scanner.close();
	}

}
