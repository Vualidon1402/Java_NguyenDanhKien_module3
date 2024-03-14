package exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberStart,numberEnd;
        boolean isNotSastify;
        do {
            System.out.println("Nhap gia tri bat dau");
            numberStart = scanner.nextInt();
            System.out.println("Nhap gia tri ket thuc");
            numberEnd = scanner.nextInt();
            isNotSastify = numberEnd <= numberStart;
            if (isNotSastify){
                System.out.println("Gia tri khong thoa man");
            }
        }while (isNotSastify);
        int result = 0;
        for (int i = numberStart; i <= numberEnd; i++){
            if (i % 2 == 0){
                result +=i;
            }
        }
        System.out.printf(String.format("Tong cac so chan trong khoan tu %d den %d la %d",numberStart,numberEnd,result));

    }
}
