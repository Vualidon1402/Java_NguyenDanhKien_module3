package exercise;

public class Exercise7 {
    public static void main(String[] args) {
        int current = 2;
        int count = 0;
        System.out.println("20 so nguyen dau tien la:");
        while (count < 20) {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(current); i++) {
            if (current % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(current + "");
            count++;
        }
        current++;
        }

    }
}
