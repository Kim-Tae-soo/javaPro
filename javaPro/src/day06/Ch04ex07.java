package day06;

public class Ch04ex07 {

	public static void main(String[] args) {
		/*
		 	break문과 continue문
		 	
		 1) break문 ==> switch문과 반복문에서 사용할 수 있다.
		 				반복문에서 break문을 만나면 반복을 중단하고 반복문 다음 문장으로 제어가 이동한다.
		 
		 2) continue문 ==> 반복문에서만 사용할 수 있다.
		 				반복문에서 continue문을 만나면 그 반복문의 조건절 위치로 제어가 이동한다.
		 				(조건절 : for문 ==> (증감식 위치)
		 						while문 , do while문 ==> (조건식 위치) )
		 
		 
		 
		 */

		/*
		for (int i =1 ; i<=10; i++) {
			if(i==5) {
				//break;
				continue;
			}
			
			System.out.println("i = " +i);
			
		}
		System.out.println("반복문 다음 문장...");
		
		*/

		
		
		/*
		 * 다음 코드는 1 ~ 10 사이의 작수를 출력하는 프로그램이다.
		 * 빈 곳을 코딩하시오
		
		
		for (int i =1 ; i<=10; i++) {
			if (i%2==1) {
				continue;
			
			}
				System.out.println("i = " +i);
			
			}
			
		 */
		
		/*
		 	1 ~ 100까지의 합계를 구하는데 4의 배수를 뺸 합계를 구하시오.
		 
		 	1 ~ 100까지의 홀수의 합계를 구하는데 합계가 1500이상이 될 때의 값을 출력하시오.
		 */
		
		
		int sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%4==0) {
				sum2 +=i;
				continue;			
            }
			sum +=i;
		}
		 System.out.println(sum);	
		 System.out.println(sum2);
		 System.out.println();
		 System.out.println("---------------------");
		 System.out.println();
		 
		int sum3 = 0;
		for (int i = 1; i <= 100; i+=2) {
			sum3 +=i;
			
			if(sum3>=1500) {
				break;			
            }
		}
		 System.out.println(sum3);	
	}

}
