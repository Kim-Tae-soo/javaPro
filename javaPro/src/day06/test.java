package day06;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 국어, 영어, 수학 점수 입력 받기
			System.out.print("국어 점수를 입력하세요 (0~100): ");
			int korean = scanner.nextInt();
			while (korean < 0 || korean > 100) {
				System.out.println("잘못된 점수입니다. 0~100 사이의 값을 입력하세요.");
				System.out.print("국어 점수를 다시 입력하세요 (0~100): ");
				korean = scanner.nextInt();
			}

			System.out.print("영어 점수를 입력하세요 (0~100): ");
			int english = scanner.nextInt();
			while (english < 0 || english > 100) {
				System.out.println("잘못된 점수입니다. 0~100 사이의 값을 입력하세요.");
				System.out.print("영어 점수를 다시 입력하세요 (0~100): ");
				english = scanner.nextInt();
			}

			System.out.print("수학 점수를 입력하세요 (0~100): ");
			int math = scanner.nextInt();
			while (math < 0 || math > 100) {
				System.out.println("잘못된 점수입니다. 0~100 사이의 값을 입력하세요.");
				System.out.print("수학 점수를 다시 입력하세요 (0~100): ");
				math = scanner.nextInt();
			}

			// 총점과 평균 계산
			int total = korean + english + math;
			double average = total / 3.0;

			// 결과 출력
			System.out.println("총점: " + total);
			System.out.println("평균: " + String.format("%.2f", average));

			// 계속할지 여부 묻기
			System.out.print("계속 하겠습니까? (Y/N): ");
			char continueInput = scanner.next().toLowerCase().charAt(0);

			// 입력된 값이 'Y' 또는 'N'인지 확인
			reset: while (true) {
				if (continueInput == 'n') {
					System.out.println("프로그램을 종료합니다.");
					break; // 'N' 입력 시 종료
				} else if (continueInput != 'y') {
					System.out.println("잘못된 입력입니다. Y 또는 N만 입력 가능합니다.");
					 break reset;
				}
			}

			scanner.close();
		}
	}
}
