package exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập tên của bạn");
        String userName = scanner.nextLine();
        System.out.printf("Hello: %s", userName);
    }
}
