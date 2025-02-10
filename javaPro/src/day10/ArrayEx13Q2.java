package day10;

public class ArrayEx13Q2 {
	
	/*
	 	문제2) 정수형 1차원 배열 2개를 매개변수로 받아서 첫번째 배열과 두번째 배열을 합친 후 
		  합쳐진 배열을 반환하는 메서드를 작성하시오.
	 */
    

	public static int[] addarr(int[] a, int[] b) {
		int ad1 = a.length;
		int ad2 = b.length;
		int[] arr = new int[ad1 + ad2];

		System.arraycopy(a, 0, arr, 0, ad1);
		System.arraycopy(b, 0, arr, ad1, ad2);

		return arr;
	}

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		int[] arr = addarr(arr1, arr2);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
