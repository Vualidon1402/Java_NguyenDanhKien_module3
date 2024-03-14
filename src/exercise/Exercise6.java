package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm Toán");
        float mathScore = scanner.nextFloat();
        System.out.println("Nhập điểm Anh Văn");
        float englishScore = scanner.nextFloat();
        System.out.println("Nhập điểm Ngữ Văn");
        float literatureScore = scanner.nextFloat();

        float totalScore = mathScore + englishScore + literatureScore;
        float mediumScore = (float) (mathScore + englishScore + literatureScore) / 3;

        System.out.printf("Điểm tổng là: %.2f, Điểm trung bình là: %.2f", totalScore, mediumScore);

    }
}
