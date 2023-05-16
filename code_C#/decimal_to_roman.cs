//csharp - decimal to roman

using System;

namespace DecimalToRoman
{
    class Program
    {
        static string DecimalToRoman(int num)
        {
            int[] val = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
            string[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

            string romanNumeral = "";
            int i = 0;

            while (num > 0)
            {
                while (num >= val[i])
                {
                    num -= val[i];
                    romanNumeral += symbols[i];
                }
                i++;
            }

            return romanNumeral;
        }

        static void Main(string[] args)
        {
            Console.Write("Enter a decimal number (1-3999): ");
            int decimalNumber = Convert.ToInt32(Console.ReadLine());

            if (1 <= decimalNumber && decimalNumber <= 3999)
            {
                string romanNumeral = DecimalToRoman(decimalNumber);
                Console.WriteLine($"Roman numeral representation of {decimalNumber} is {romanNumeral}");
            }
            else
            {
                Console.WriteLine("Invalid input! Please enter a number between 1 and 3999.");
            }
        }
    }
}
/*To compile and run this C# program, you can use the .NET Core SDK. Follow these steps:

Install the .NET Core SDK if you haven't already. You can download it from the official .NET website: https://dotnet.microsoft.com/download

Save the C# code to a file with the extension ".cs", for example, "Program.cs".

Open a terminal/command prompt in the directory where the ".cs" file is saved.

Create a new .NET console application using the following command:

javascript
Copy code
dotnet new console -n DecimalToRoman
This command creates a new folder named "DecimalToRoman" with the necessary files for a .NET console application.

Move your "Program.cs" file into the "DecimalToRoman" folder, replacing the existing "Program.cs" file.

Change your current working directory to the "DecimalToRoman" folder using the following command:

bash
Copy code
cd DecimalToRoman
Compile and run the C# program using the following command:

arduino
Copy code
dotnet run
This command builds and runs the C# program. Your C# program should now be running, and you should see the output in the terminal/command prompt. */
