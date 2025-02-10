package day07;
import java.util.Scanner;

public class Ch04MethodTest02_Q2 {

    
    public static int sumOfOdds(int num) {
        int sum = 0;
        
        for (int i = 1; i <= num; i+=2) {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        do {
            System.out.print("양의 정수를 입력하세요 : ");
            num = scan.nextInt();

        }while(num<=0); 

        
        int result = sumOfOdds(num);
        System.out.println("1부터 " + num + "까지의 홀수의 합: " + result);

        scan.close();
    }
}
