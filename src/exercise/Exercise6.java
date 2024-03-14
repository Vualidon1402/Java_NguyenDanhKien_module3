package exercise;
import java.util.Scanner;

public class Exercise6 {
    public static byte[][] get2DArrayFromUser(Scanner scanner){
        // Bước 1: Nhap so dong va cot
        System.out.println("Nhap so dong: ");
        int rows = scanner.nextInt();
        System.out.println("Nhap so cot: ");
        int columns = scanner.nextInt();

        // Bước 2: Khai bao mang 2 chieu
        byte[][] arr = new byte[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Nhap phan tu tai hang %d, cot %d: ", i + 1, j + 1);
                arr[i][j] = scanner.nextByte();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte[][] arr = get2DArrayFromUser(scanner);

        int rows = arr.length;
        int columns = arr[0].length;

        // Bước 3: Hien thi mang 2 chieu
        System.out.println("Mang 2 chieu vua nhap:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Bước 4: Nhap so cot can tinh tong

        int y;

        // Kiem tra xem co hop le hay khong
        while (true){
            System.out.println("Nhap vi tri cot can tinh tong: ");
            y = scanner.nextInt();
            if (y < 0 || y >= columns) {
                System.out.println("cot nhap khong hop le, vui long nhap lai");
            } else {
                // Bước 5: Tinh tong phan tu cot y
                byte sum = 0;
                for (int i = 0; i < rows; i++) {
                    sum += arr[i][y];
                }
                System.out.printf("Tong cac phan tu o cot %d la: %d ",y,sum);
                System.out.println("Ban co muon tiep tuc su dung chuong trinh khong (Y/n)");
                scanner.nextLine();
                char answer = scanner.nextLine().toLowerCase().charAt(0);
                if(answer == 'n' ){
                    break;
                }
            }
        }

    }
}
