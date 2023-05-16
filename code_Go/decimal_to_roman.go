//go - decimal to roman

package main

import (
	"fmt"
	"strings"
)

func decimalToRoman(num int) string {
	val := []int{
		1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1,
	}
	symbols := []string{
		"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",
	}

	romanNumeral := strings.Builder{}
	i := 0

	for num > 0 {
		for num >= val[i] {
			num -= val[i]
			romanNumeral.WriteString(symbols[i])
		}
		i++
	}

	return romanNumeral.String()
}

func main() {
	var decimalNumber int
	fmt.Print("Enter a decimal number (1-3999): ")
	fmt.Scan(&decimalNumber)

	if 1 <= decimalNumber && decimalNumber <= 3999 {
		romanNumeral := decimalToRoman(decimalNumber)
		fmt.Printf("Roman numeral representation of %d is %s\n", decimalNumber, romanNumeral)
	} else {
		fmt.Println("Invalid input! Please enter a number between 1 and 3999.")
	}
}
/* The main differences are:

Replaced #include <stdio.h> with the import of "fmt" and "strings" packages in Go.
Changed the function signature to return a string instead of modifying a character array.
Replaced the use of strcat with Go's strings.Builder.
Updated the main function to use fmt.Print, fmt.Scan, and fmt.Printf for user input and output.

User
how to run go files
ChatGPT
To run Go files, you need to have the Go compiler installed on your system. If you haven't already installed it, you can download it from the official Go website: https://golang.org/dl/

Once you have the Go compiler installed, follow these steps to run a Go file:

Save the Go code to a file with the extension ".go", for example, "main.go".

Open a terminal/command prompt in the directory where the ".go" file is saved.

To run the code directly without building an executable, use the following command:

go
Copy code
go run main.go
Replace "main.go" with the name of your Go file, if different.

This command compiles and runs the Go code in a single step. If there are any compilation errors, they will be displayed in the terminal.

Alternatively, you can build an executable binary from your Go file and then run it. To do this, use the following commands:

go
Copy code
go build main.go
This command compiles the Go code into an executable binary. If the compilation is successful, an executable file named "main" (or "main.exe" on Windows) will be created in the same directory.

bash
Copy code
./main
On Windows, use .\main.exe instead. This command runs the compiled executable.

Note that you need to replace "main.go" and "main" with the appropriate names if your Go file or desired executable name is different.

That's it! Your Go file should now be running, and you should see the output in the terminal/command prompt.
	}
}
The main differences are:

Replaced #include <stdio.h> with the import of "fmt" and "strings" packages in Go.
Changed the function signature to return a string instead of modifying a character array.
Replaced the use of strcat with Go's strings.Builder.
Updated the main function to use fmt.Print, fmt.Scan, and fmt.Printf for user input and output. */
