package exercise;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap canh A");
            int canhA = scanner.nextInt();
            System.out.println("Nhap canh B");
            int canhB = scanner.nextInt();
            System.out.println("Nhap canh C");
            int canhC = scanner.nextInt();

            if (canhA > 0 && canhB > 0 && canhC > 0 && canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA) {
                float halfPerimeter = (float) (canhA + canhB + canhC) / 2;
                float perimeter = canhA + canhB + canhC;
                float area = (float) Math.sqrt(halfPerimeter * (halfPerimeter - canhA) * (halfPerimeter - canhB) * (halfPerimeter - canhC));

                System.out.printf("Chu vi tam giac la: %f\n", perimeter);
                System.out.printf("Dien tich tam giac la: %f\n", area);
                break;
            } else {
                System.out.println("Ba canh vua nhap khong tao thanh tam giac. Vui long nhap lai.");
            }
        }
    }
}