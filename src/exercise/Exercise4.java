package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập 1 số");
        int a = scanner.nextInt();
        int square = a*a;
        int cube = a*a*a;
        System.out.printf("Bình phương là: %d, Lập phương là: %d", square, cube);
    }
}
