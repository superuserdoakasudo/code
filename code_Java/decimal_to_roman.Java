java - decimal to roman

import java.util.Scanner;

public class DecimalToRoman {
    public static String decimalToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();
        int i = 0;

        while (num > 0) {
            while (num >= val[i]) {
                num -= val[i];
                romanNumeral.append(symbols[i]);
            }
            i++;
        }

        return romanNumeral.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number (1-3999): ");
        int decimalNumber = scanner.nextInt();

        if (1 <= decimalNumber && decimalNumber <= 3999) {
            String romanNumeral = decimalToRoman(decimalNumber);
            System.out.printf("Roman numeral representation of %d is %s%n", decimalNumber, romanNumeral);
        } else {
            System.out.println("Invalid input! Please enter a number between 1 and 3999.");
        }
    }
}

/*To run this Java program, follow these steps:

Save the Java code to a file with the extension ".java", for example, "DecimalToRoman.java".

Open a terminal/command prompt in the directory where the ".java" file is saved.

Compile the Java file using the following command:

Copy code
javac DecimalToRoman.java
This command compiles the Java code into bytecode. If the compilation is successful, a file named "DecimalToRoman.class" will be created in the same directory.

Run the compiled Java class using the following command:

Copy code
java DecimalToRoman
This command runs the compiled Java class. Your Java program should now be running, and you should see the output in the terminal/command prompt. */




