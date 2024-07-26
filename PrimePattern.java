import java.util.*;
public class PrimePattern {
    static int b = 1;

    public static int nextnum() {
        b = b + 1;
        return b;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int getNextPrime() {
        while (true) {
            nextnum();
            if (isPrime(b)) {
                return b;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getNextPrime() + " ");
            }
            System.out.println();
        }
    }
}
