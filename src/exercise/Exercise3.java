//package exercise;
//
//import java.util.Scanner;
//
//public class Exercise3 {
//    public static void main(String[] args) {
//    //input arr1, arr2
//        int[] array1 = getArrFromUser();
//        System.out.println(array1);
//        int[] array2 = getArrFromUser();
//        System.out.println(array2);
//    //tinh chieu dai array3
//    short length3 = (short) (array1.length + array2.length);
//    int[]
//    }
//    public static int[] getArrFromUser() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("pls input the length of array: \n");
//        byte length = Byte.parseByte(scanner.nextLine());
//        int[] array = new int[length];
//        for(int i = 0; i < length; i++){
//            System.out.println(String.format("pls input the at index %d", i+1));
//            array[i] = Integer.parseInt(scanner.nextLine());
//        }
//        return array;
//    }
//    public static String printArray(int[] array) {
//        String result = "Array: [";
//        for (int number : array) {
//            result += number + ",";
//        }
//        int length = array.length;
//        result.substring(0, length-2);
//        result += "]";
//        return result;
//    }
//}
