package exercise;

public class Exercise6 {
    public static void main(String[] args) {
        int number = 1;
        while(true) {
            if (number % 5 == 0 && number % 7 == 0 && number % 11 == 0) {
                System.out.printf(String.format("so %d la so chia het cho 5, 7 va 11", number));
                break;
            }
            number++;
        }
    }
}
