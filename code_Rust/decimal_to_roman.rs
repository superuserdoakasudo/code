// rust - decimal_to_roman

use std::io;

fn decimal_to_roman(num: i32) -> String {
    let val = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
    let symbols = [
        "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",
    ];

    let mut roman_numeral = String::new();
    let mut num = num;
    let mut i = 0;

    while num > 0 {
        while num >= val[i] {
            num -= val[i];
            roman_numeral.push_str(symbols[i]);
        }
        i += 1;
    }

    roman_numeral
}

fn main() {
    let mut decimal_number = String::new();

    println!("Enter a decimal number (1-3999): ");
    io::stdin()
        .read_line(&mut decimal_number)
        .expect("Failed to read input");

    let decimal_number: i32 = decimal_number.trim().parse().expect("Invalid number");

    if 1 <= decimal_number && decimal_number <= 3999 {
        let roman_numeral = decimal_to_roman(decimal_number);
        println!(
            "Roman numeral representation of {} is {}",
            decimal_number, roman_numeral
        );
    } else {
        println!("Invalid input! Please enter a number between 1 and 3999.");
    }
}
/* To compile and run this Rust program, you need to have Rust and Cargo (the Rust package manager) installed on your system.

If you haven't already installed them, you can download Rust and Cargo from the official Rust website: https://www.rust-lang.org/tools/install

Once you have Rust and Cargo installed, follow these steps to run the Rust program:

Save the Rust code to a file with the extension ".rs", for example, "main.rs".

Open a terminal/command prompt in the directory where the ".rs" file is saved.

Create a new Rust project using Cargo with the following command:

arduino
Copy code
cargo new decimal_to_roman
This command creates a new folder named "decimal_to_roman" with the necessary files for a Rust project.

Move your "main.rs" file into the "src" folder inside the "decimal_to_roman" folder, replacing the existing "main.rs" file.

Change your current working directory to the "decimal_to_roman" folder using the following command:

bash
Copy code
cd decimal_to_roman
Compile and run the Rust program using the following command:

arduino
Copy code
cargo run
This command compiles and runs the Rust program. If there are any compilation errors, they will be displayed in the terminal.

Your Rust program should now be running, and you should see the output in the terminal/command prompt. */
