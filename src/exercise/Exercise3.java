package exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập chiều rộng");
        int width = scanner.nextInt();
        System.out.println("Hãy nhập chiều dài");
        int height = scanner.nextInt();
        int perimeter = (width + height) * 2;
        int area = width * height;
        System.out.printf("Chu vi là: %d, Diện tích là: %d", perimeter, area);

    }
}
