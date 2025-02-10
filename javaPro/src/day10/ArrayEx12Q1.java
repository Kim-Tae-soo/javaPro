package day10;

public class ArrayEx12Q1 {

	public static void main(String[] args) {
		/*
			배열을 메서드에서 사용하기
			
			메서드를 호출할 때 메서드의 파라미터 변수에 전달되는 데이터가 
			'일반적인 값'인 경우와 '참조값'인 경우가 있다.
			 
			1. 전달되는 값이 '일반적인 값' 인 경우 ==> 'Call by Value'라고 한다. 
				==> 호출하는 곳의 변수와 메서드에서 처리하는 변수가 서로 다른 메모리 영역을 가리킨다.
				
			2. 전달되는 값이 '참조값' 인 경우 ==> 'Call by reference'라고 한다. 
				==> 호출하는 곳의 변수와 메서드에서 처리하는 변수가 같은 메모리 영역을 가리킨다.
		*/
		
		int x = 100;
		int y = 300;
		System.out.println("메서드 호출 전 : x = " + x + ", y = " + y);
		swap(x,y);
		System.out.println("메서드 호출 후 : x = " + x + ", y = " + y);
		System.out.println();
		System.out.println("-----------------------------------------");
		
		int[] num = new int[] {100,300};
		System.out.println("배열 메서드 호출 전 : num[0] = " + num[0] + ", num[1] = " + num[1]);
		swapArray(num); // 배열 변수에는 실제 주소가 저장이 되어서 swapArray 메서드에서 변경이 된다아
		System.out.println("배열 메서드 호출 후 : num[0] = " + num[0] + ", num[1] = " + num[1]);
		System.out.println();
		System.out.println("-----------------------------------------");
		
		int[] test;
		test = returnArray();
		System.out.println("배열의 개수 : " + test.length);
		System.out.println("test[0] = " +test[0]);
		
	}
	
	// 매개변수의 값을 서로 맞바꾸는 메서드
	public static void swap(int x, int y) {
		System.out.println("메서드 안에서 처리 전 : x = " + x + ", y = " + y);
		int temp = x;
		x = y;
		y = temp;   // x값과 y값을 맞바꾸는 과정 Line22 - 25
		System.out.println("메서드 안에서 처리 후 : x = " + x + ", y = " + y);
	}
	
	
	// 배열의 0번째와 1번째를 맞바꿔 주는 메서드
	public static void swapArray(int[] arr) {
		System.out.println("메서드 안에서 처리 전 : arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;   // x값과 y값을 맞바꾸는 과정 Line22 - 25
		System.out.println("메서드 안에서 처리 후 : arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
	}
	
	// 반환값이 배열인 메서드
	
	public static int[] returnArray() {
		int[] test = new int [3];
		test[0] = 500;
		return test; //test가 갖고있는 반환값을 가져옴 반환값은 62라인
	}
	

}
