cpp - decimal to roman

#include <iostream>
#include <string>

std::string decimalToRoman(int num) {
    int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    std::string symbols[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    std::string romanNumeral = "";
    int i = 0;

    while (num > 0) {
        while (num >= val[i]) {
            num -= val[i];
            romanNumeral += symbols[i];
        }
        i++;
    }

    return romanNumeral;
}

int main() {
    int decimalNumber;
    std::cout << "Enter a decimal number (1-3999): ";
    std::cin >> decimalNumber;

    if (1 <= decimalNumber && decimalNumber <= 3999) {
        std::string romanNumeral = decimalToRoman(decimalNumber);
        std::cout << "Roman numeral representation of " << decimalNumber << " is " << romanNumeral << std::endl;
    } else {
        std::cout << "Invalid input! Please enter a number between 1 and 3999." << std::endl;
    }

    return 0;
}

/*To compile and run this C++ program, follow these steps:

Save the C++ code to a file with the extension ".cpp", for example, "DecimalToRoman.cpp".

Open a terminal/command prompt in the directory where the ".cpp" file is saved.

Compile the C++ file using the following command:

Copy code
g++ -o DecimalToRoman DecimalToRoman.cpp
Replace g++ with the appropriate C++ compiler for your system if different. This command compiles the C++ code into an executable. If the compilation is successful, an executable file named "DecimalToRoman" (or "DecimalToRoman.exe" on Windows) will be created in the same directory.

Run the compiled C++ executable using the following command:

Copy code
./DecimalToRoman
On Windows, use .\DecimalToRoman.exe instead. This command runs the compiled executable. Your C++ program should now be running, and you should see the output in the terminal/command prompt. */
