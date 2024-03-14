package exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(String.format("%50s", "DANH SÁCH SINH VIÊN"));
        String lineSeparator = "------------------------------------------------------------------------\n";
        String formatHeader = "| %-3s | %-15s | %-5s | %-15s | %-20s|\n";
        String formatRow = "| %-3d | %-15s | %-5d | %-15s | %-20s|\n";
        System.out.printf(lineSeparator);
        System.out.printf(formatHeader, "STT","Ho va ten","Tuoi", "So dien thoai", "Email");
        System.out.printf(lineSeparator);
        System.out.printf(formatRow, 1, "Nguyen Van A", 20, "0906453633", "anvc@gmail.com" );
        System.out.printf(lineSeparator);

    }
}
