package day08;

public class ArrayEx04_HW1_BubbleSort2 {

	public static void bubble(int[] arr) {

		final int N = arr.length;

		int temp;

		for (int loop = 1; loop < N; loop++) {
			for (int i = 0; i < N - loop; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i] + "");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 8, 2, 4, 3 };
		bubble(arr);
		System.out.println();

		int[] arr2 = { 5, 8, 2, 4, 3, 10, 500, 7, 6, 1 };
		bubble(arr2);

	}

}
