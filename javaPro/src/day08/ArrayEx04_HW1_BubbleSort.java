package day08;

public class ArrayEx04_HW1_BubbleSort {

	public static void main(String[] args) {
		// 주말 동안 숙제 ==> 정렬 알고리즘 (버블정렬, 선택정렬, 삽입정렬에 대하여 공부해오기)
		// (정렬 방법과 소스를 작성해 보기)

		/*
		 * 1. 버블 정렬(Bubble Sort) : 데이터의 인접 요소끼리 비교하고, swap 연산을 수행하며 정렬하는 방식 
		 */

		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		bubbleSort(arr);
		System.out.println("버블 정렬 : ");
		for (int i : arr) {
			System.out.println(i + "");
		}

	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			if (!swapped) {
				break;
			}

		}
	}

}
