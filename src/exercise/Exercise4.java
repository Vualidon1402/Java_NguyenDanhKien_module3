package exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
//        cho phep nguoi dung nhap vao so dong va cot
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong");
        byte row = scanner.nextByte();
        System.out.println("Nhap so cot");
        byte column = scanner.nextByte();
//        khoi tao mang 2 chieu tu gia tri ng dung nhap vao
        byte[][] numberArr = new byte[row][column];
//        cho nguoi dung khoi tao cac gia tri cua mang
        for (byte rowIndex = 0; rowIndex < row; rowIndex++) {
            for (byte columnIndex = 0; columnIndex < column; columnIndex++) {
                System.out.printf("Vui long nhap phan tu tai hang %d, cot %d \n", rowIndex + 1, columnIndex + 1);
                numberArr[rowIndex][columnIndex] = scanner.nextByte();
            }
        }
//        tim phan tu lon nhat trong mang 2 chieu
        byte max = numberArr[0][0];
        byte item;
        int maxRow = 0;
        int maxColumn = 0;
        for (byte rowIndex = 0; rowIndex < row; rowIndex++) {
            for (byte columnIndex = 0; columnIndex < column; columnIndex++) {
                item = numberArr[rowIndex][columnIndex];
                if (max < item) {
                    max = item;
                    maxRow = rowIndex;
                    maxColumn = columnIndex;

                }
            } 
        }
        System.out.printf(String.format("gia tri lon nhat la: %d, o vi tri dong %d cot %d", max,maxRow + 1,maxColumn + 1));
    }
}
