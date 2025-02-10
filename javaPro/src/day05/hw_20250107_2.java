package day05;

public class hw_20250107_2 {

	public static void main(String[] args) {
	/*
	    [과제]
		for문을 이용하여 다음과 같이 출력하시오.
		
		*
		**
		***
		****
		*****
	*/
		
		System.out.println("1번 문제");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
		
	/*
		
		    *
		   **
		  ***
		 ****
		*****
	*/
		
		System.out.println("2번 문제");
		for(int i=1; i<=5; i++) {  //5줄 1
			for(int j=0; j<=5-i; j++) {	//공백
				System.out.print(" ");	
			}for(int k=1; k<=i; k++) {	//별
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
		
	/*
		
	 	*****
	 	****
	 	***
	 	**
	 	*

	*/	
		System.out.println("3번 문제");
		for(int i=1; i<=5; i++){                // 줄반복. 5줄
            for(int j=5; j>i-1; j--){           // 별반복. 5개부터 시작
                System.out.print("*");
            }
            System.out.println();
        }
		System.out.println();
		System.out.println("------------------------");
		System.out.println();	
	/*
		
		 *****
		  ****
		   ***
		    **
		     *

	*/	
		System.out.println("4번 문제");
		for(int i=1; i<=5; i++) { //네줄 출력
			for(int j =0; j<i; j++) { //공백 출력
				System.out.print(" ");
			}
			for(int k=0; k<=5-i; k++) {	//별출력
				System.out.print("*");
			}System.out.println();
		}
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
	/*
			
 		    *   
		   ***   
		  *****  
		 ******* 
	*/	
		
		System.out.println("5번 문제");
		for(int i=1; i<=4; i++){
            for(int j=5-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
		System.out.println();
		System.out.println("------------------------");
		System.out.println();	
		
	/*
			
	 	*******
		 *****
		  ***
		   *
	*/	

		  System.out.println("6번 문제");
	        for(int i=1; i<=4; i++){
	            for(int j=0; j < i; j++){
	                System.out.print(" ");
	            }
	            for(int j=(5-i)*2 -1; j>0; j--){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        System.out.println();
			System.out.println("------------------------");
			System.out.println();	
	            
	
	/*
			
	 	****
		*  *
		*  *
		****
	*/	
			System.out.println("7번 문제");

			// 이중 반복문
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= 4; j++) {
					// 사각형의 테두리를 출력하고, 가운데 칸은 공백을 출력
					if (i == 2 || i == 3) {
						if (j == 2 || j == 3) {
							System.out.print(" "); // 가운데 4칸은 공백
						} else {
							System.out.print("*"); // 나머지는 별
						}
					} else {
						System.out.print("*"); // 첫 번째와 마지막 줄은 모두 별
					}
				}
				System.out.println(); // 한 줄 끝나면 줄 바꿈
			}

			System.out.println();
			System.out.println("------------------------");
			System.out.println();


	        
	    }

}
