package day08;

public class ArrayEx04_HW3_InsertionSort {

	public static int[] arr = new int[5];

	public static void main(String[] args) {
		/*
		 * 3. 삽입정렬(Insertion Sort) : 대상을 선택해 정렬된 영역에서 선택 데이터의 적절한 위치를 찾아 삽입하면서 정렬하는 방식
		 */
		arr = new int[] { 5, 4, 1, 3, 2 };

		insertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	private static void insertionSort(int[] arr2) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i]; // 선택 데이터
			int j = i - 1; // 비교 데이터

			// 이전의 운소가 더 크다면 데이터는 하나씩 밀려난다.
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = key;
		}
	}

}
