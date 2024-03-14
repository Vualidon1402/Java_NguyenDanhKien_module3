package exercise;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("hay nhap 1 so bat ky (nhap 0 de thoat):");
            number = scanner.nextInt();
           boolean isEven3 = number % 3 == 0;
           boolean isEven5 = number % 5 == 0;

            if (isEven3 && isEven5 ){
                System.out.println("So nay chia het cho 5 va 3");
            } else if (isEven3) {
                System.out.println("So nay chia het cho 3");

            } else if (isEven5) {
                System.out.println("So nay chia het cho 5");
            }
            else {
                System.out.println("So nay không chia het cho 5 va 3");
            }
       }while (number != 0);
    }

}
