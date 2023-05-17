import java.util.Scanner;

public class decimalToRoman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        input.close();

        String roman = convertToRoman(decimal);
        System.out.println("Roman numeral: " + roman);
    }

    public static String convertToRoman(int decimal) {
        int[] decimalValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanSymbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < decimalValues.length; i++) {
            while (decimal >= decimalValues[i]) {
                romanNumeral.append(romanSymbols[i]);
                decimal -= decimalValues[i];
            }
        }

        return romanNumeral.toString();
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




