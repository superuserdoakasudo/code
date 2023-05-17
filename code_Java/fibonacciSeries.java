import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int number = input.nextInt();
        input.close();

        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < number; i++) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}