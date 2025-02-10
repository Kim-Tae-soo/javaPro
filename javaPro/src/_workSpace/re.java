package _workSpace;

public class re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			int sum = 0;
			sum += i;
			System.out.println(sum);

			if (i == 5) {
				System.out.println("dd");
				continue;
			} else {
				break;
			}

		}
		int a = 5;
		int num = 1;
		while (a>5) {
			
			switch (num / 10) {
			case 10, 9: {
				num = 1;
				break;
			}
			default:
				break;
			}

		}
		
		while (true) {
		    if (a == 5) { // 문자열 비교는 equals
		        
		        continue; // 잘못입력 다시 ㄱ
		    }
		}


	}
}
