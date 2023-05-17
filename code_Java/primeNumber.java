import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        int n, m, flag = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to check prime:");
        n = scanner.nextInt();
        m = n / 2;

        for (int i = 2; i <= m; i++) {
            if (n % i == 0) {
                System.out.println("Number is not prime");
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Number is prime");
        }
    }
}