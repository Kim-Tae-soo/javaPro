package day09;

public class ArrayEx09 {

	public static void main(String[] args) {
		// 아래와 같이 2차원 배열이 초기화 되어 있는데 각 행별 총점과 평균을 구하시오
		// (단, 총점과 평균은 1차원 배열로 만들어서 저장한다.
		int[][] num = new int[][] { 
			{ 90, 80, 60, 80 }, 
			{ 80, 50, 60, 70 }, 
			{ 90, 70, 60, 20 }, 
			{ 50, 60, 90, 60 },
			{ 70, 90, 80, 60 } 
		};

		int[] total = new int[num.length];
		double[] avg = new double[num.length];

		for (int i = 0; i < num.length; i++) {
			int sum = 0;
			for (int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}

			total[i] = sum;
			avg[i] = (double) sum / num[i].length;
		}

		for (int i = 0; i < num.length; i++) {
			System.out.println("열 : " + (i + 1) + "\nTotal : " + total[i] + "\nAvg : " + avg[i] + "\n");
		}

	}

}
