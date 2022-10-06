import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int numbers = scanner.nextInt();

        int count = 0, n = 2;
        while (count < numbers) {
            boolean isPrime = true;
            if (n == 2) {
                System.out.println(n);
                n++;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(n);
                }
            }
            n++;
            count++;
        }
    }
}