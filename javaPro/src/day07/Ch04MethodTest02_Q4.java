package day07;

import java.util.Scanner;

public class Ch04MethodTest02_Q4 {

	// 섭씨를 화씨로 변환하는 메서드
    public static double cel(double cel) {
        return cel * 9 / 5 + 32;
    }
    // 화씨를 섭씨로 변환하는 메서드
    public static double fah(double fah) {
        return (fah - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("섭씨 온도를 입력하세요: ");
        double cel = scan.nextDouble();
        double fah = cel(cel);
        System.out.println("섭씨 " + cel + "°C는 화씨 " + fah + "°F 입니다.");

        System.out.print("화씨 온도를 입력하세요: ");
        double tempF = scan.nextDouble();
        double tempC = fah(tempF);
        System.out.println("화씨 " + tempF + "°F는 섭씨 " + tempC + "°C 입니다.");

        scan.close();
    }
}
