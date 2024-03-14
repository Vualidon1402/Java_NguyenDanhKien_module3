package exercise;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true ){

            System.out.println("Chon muc ban mong muon");
            System.out.println("1. Tinh chu vi va dien tich hinh chu nhat");
            System.out.println("2. Tinh chu vi va dien tich hinh tam giac");
            System.out.println("3. Tinh chu vi va dien tich hinh tron");
            System.out.println("4. Thoat");
            int choise = scanner.nextInt();
            switch (choise){
                case 1:
                    System.out.println("Chu vi va dien tich hinh chu nhat");
                    System.out.println("Nhap canh A");
                    int canhA = scanner.nextInt();
                    System.out.println("Nhap canh B");
                    int canhB = scanner.nextInt();
                    float perimeter = canhA + canhB;
                    float area = (canhA + canhB)*2;
                    System.out.printf("Chu vi hinh chu nhat la: %.0f \n",perimeter);
                    System.out.printf("Dien tich hinh chu nhat la: %.0f \n",area);
                    break;
                case 2:
                    System.out.println("Chu vi va dien tich hinh tam giac");
                    System.out.println("Nhap canh C");
                    int canhC = scanner.nextInt();
                    System.out.println("Nhap canh D");
                    int canhD = scanner.nextInt();
                    System.out.println("Nhap canh E");
                    int canhE = scanner.nextInt();

                    if (canhC > 0 && canhD > 0 && canhE > 0 && canhC + canhD > canhE && canhC + canhE > canhD && canhD + canhE > canhC) {
                        float halfPerimeter = (float) (canhC + canhD + canhE) / 2;
                        float perimeterTriagle = canhC + canhD + canhE;
                        float areaTriagle = (float) Math.sqrt(halfPerimeter * (halfPerimeter - canhC) * (halfPerimeter - canhD) * (halfPerimeter - canhE));

                        System.out.printf("Chu vi tam giac la: %f\n", perimeterTriagle);
                        System.out.printf("Dien tich tam giac la: %f\n", areaTriagle);
                        break;
                    } else {
                        System.out.println("Ba canh vua nhap khong tao thanh tam giac. Vui long nhap lai.");
                    }
                    break;
                case 3:
                    System.out.println("Chu vi va dien tich hinh tron");
                    final double PI = 3.14;
                    System.out.println("Nhap ban kinh hinh tron");
                    int radius = scanner.nextInt();
                    double perimeterRound = (2*radius)*PI;
                    double areaRound = (radius*radius)*PI;
                    System.out.printf("Chu vi hinh tron la: %f \n",perimeterRound);
                    System.out.printf("Dien tich hinh tron la: %f \n",areaRound);


            }

        }
    }
}