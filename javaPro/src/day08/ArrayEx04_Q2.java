package day08;

import java.util.Random;
import java.util.Scanner;

public class ArrayEx04_Q2 {

   public static void main(String[] args) {
      /*
         문제) 컴퓨터와 가위, 바위, 보 게임을 진행하는 프로그램을 작성하시오.
               컴퓨터의 가위, 바위, 보 는 난수를 이용해서 정하고
               사용자의 가위, 바위, 보 는 입력을 받아서 정한다.
               (컴퓨터의 가위 바위 보를 정할 때 배열을 사용한다.)
       */

      String[] choices = {"가위", "바위", "보"};
      Scanner sc = new Scanner(System.in);

      while (true) {
         Random random = new Random();
         int cc = random.nextInt(3); // 컴퓨터 난수 설정 (3) 인 이유 0, 1, 2 3가지

         
         System.out.println("가위, 바위, 보 중 하나를 입력하세요 (종료하려면 '종료' 입력): ");
         String uc = sc.nextLine();

         if (uc.equals("종료")) {
            System.out.println("게임을 종료합니다.");
            break;
         }

         if (!uc.equals("가위") && !uc.equals("바위") && !uc.equals("보")) {
            System.out.println("잘못된 입력입니다. 가위, 바위, 보 중 하나를 입력하세요.");
            continue;  // 잘못된 입력시 다시 시작
         }

        
         System.out.println("컴퓨터 : " + choices[cc]);
         if (uc.equals(choices[cc])) {
            System.out.println("비겼습니다!");
         } else if ((uc.equals("가위") && choices[cc].equals("보")) ||
                    (uc.equals("바위") && choices[cc].equals("가위")) ||
                    (uc.equals("보") && choices[cc].equals("바위"))) {
            System.out.println("사용자가 이겼습니다!");
         } else {
            System.out.println("컴퓨터가 이겼습니다!");
         }
      }

      sc.close(); 
   }
}
