//c - decimal to roman

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void decimalToRoman(int num, char *romanNumeral) {
    int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    char *symbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    int i = 0;
    while (num > 0) {
        while (num >= val[i]) {
            num -= val[i];
            strcat(romanNumeral, symbols[i]);
        }
        i++;
    }
}

int main() {
    int decimalNumber;
    char romanNumeral[64] = "";

    printf("Enter a decimal number (1-3999): ");
    scanf("%d", &decimalNumber);

    if (1 <= decimalNumber && decimalNumber <= 3999) {
        decimalToRoman(decimalNumber, romanNumeral);
        printf("Roman numeral representation of %d is %s\n", decimalNumber, romanNumeral);
    } else {
        printf("Invalid input! Please enter a number between 1 and 3999.\n");
    }

    return 0;
}

/*To compile and run this C program, follow these steps:

Save the C code to a file with the extension ".c", for example, "decimal_to_roman.c".

Open a terminal/command prompt in the directory where the ".c" file is saved.

Compile the C file using the following command:

Copy code
gcc -o decimal_to_roman decimal_to_roman.c
Replace "gcc" with the appropriate C compiler for your system if different. This command compiles the C code into an executable. If the compilation is successful, an executable file named "decimal_to_roman" (or "decimal_to_roman.exe" on Windows) will be created in the same directory.

Run the compiled C executable using the following command:

bash
Copy code
./decimal_to_roman
On Windows, use .\decimal_to_roman.exe instead. This command runs the compiled executable. Your C program should now be running, and you should see the output in the terminal/command prompt. */
