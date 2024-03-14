//package exercise;
//
//import java.util.Scanner;
//
//public class Exercise1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Chương trinh xoa 1 phan tu khoi mang");
//
//        int[] arrInt = {1,2,3,4,5,6,7,8,10};
//        int sizeOfArr = arrInt.length;
//        int[] newArr = new int[sizeOfArr - 1];
//        int inputDeleteValue = getInputFormUser(arrInt);
//        int index = 0;
//        for (int i = 0; i < sizeOfArr; i++) {
//            if (arrInt[i] == inputDeleteValue){
//                continue;
//            }
//            newArr[index] = arrInt[i];
//            index++;
//        }
//
//    }
//
//    public static int getInputFormUser(int[] arrInt){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Mang gia tri");
//        for (int number : arrInt) {
//            System.out.printf("%d ",number);
//        }
//
//        boolean checkValid;
//        while (true){
//            System.out.println("Xin moi nhap gia tri");
//            int inputDeleteValue = Integer.parseInt(scanner.nextLine());
//            checkValid = isValid(arrInt)
//        }
//    }
//
//    public static int isValid(int[] intArr, int inputDeleteValue){
//        for (int number : intArr){
//            if (inputDeleteValue == number){
//                return
//            }
//        }
//    }
//}
