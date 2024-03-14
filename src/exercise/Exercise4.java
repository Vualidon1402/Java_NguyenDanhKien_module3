package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float maths,physics,chemistry,literature,english;
        float totalScore;
        System.out.println("nhap diem toan");
        maths = scanner.nextFloat();
        System.out.println("nhap diem ly");
        physics = scanner.nextFloat();
        System.out.println("nhap diem hoa");
        chemistry = scanner.nextFloat();
        System.out.println("nhap diem văn");
        literature = scanner.nextFloat();
        System.out.println("nhap diem anh van");
        english = scanner.nextFloat();
        totalScore = (maths + physics + chemistry + literature + english) / 5;
        System.out.printf("Diem trung binh la: %.2f \n",totalScore);
        if (totalScore < 5){
            System.out.println("yeu");
        } else if (totalScore < 6.5) {
            System.out.println("tb");
        } else if (totalScore < 8) {
            System.out.println("kha");
        } else if (totalScore < 9) {
            System.out.println("gioi");
        } else {
            System.out.println("xuat xac");
        }

    }
}
