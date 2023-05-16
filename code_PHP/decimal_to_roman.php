//php - decimal_to_roman

<?php

function decimalToRoman($num) {
    $val = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
    $symbols = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I'];

    $romanNumeral = '';
    $i = 0;

    while ($num > 0) {
        while ($num >= $val[$i]) {
            $num -= $val[$i];
            $romanNumeral .= $symbols[$i];
        }
        $i++;
    }

    return $romanNumeral;
}

echo "Enter a decimal number (1-3999): ";
$decimalNumber = intval(fgets(STDIN));

if (1 <= $decimalNumber && $decimalNumber <= 3999) {
    $romanNumeral = decimalToRoman($decimalNumber);
    echo "Roman numeral representation of {$decimalNumber} is {$romanNumeral}\n";
} else {
    echo "Invalid input! Please enter a number between 1 and 3999.\n";
}

/* To run this PHP program, you need to have PHP installed on your system. If you haven't already installed it, you can download PHP from the official PHP website: https://www.php.net/downloads

Once you have PHP installed, follow these steps to run the PHP program:

Save the PHP code to a file with the extension ".php", for example, "decimal_to_roman.php".

Open a terminal/command prompt in the directory where the ".php" file is saved.

Run the PHP program using the following command:

Copy code

php decimal_to_roman.php

Replace "decimal_to_roman.php" with the name of your PHP file, if different.

Your PHP program should now be running, and you should see the output in the terminal/command prompt. */
