package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số tiền bạn cần đổi");
        int USD = scanner.nextInt();
        int VND = rate * USD;
        System.out.printf("Số tiền sau chuyển là: %d", VND);
    }
}
