def decimal_to_roman(num):
    val = [
        1000, 900, 500, 400,
        100, 90, 50, 40,
        10, 9, 5, 4,
        1
        ]
    symbols = [
        "M", "CM", "D", "CD",
        "C", "XC", "L", "XL",
        "X", "IX", "V", "IV",
        "I"
        ]
    roman_numeral = ''
    i = 0
    while num > 0:
        for _ in range(num // val[i]):
            roman_numeral += symbols[i]
            num -= val[i]
        i += 1
    return roman_numeral

# Accept user input
decimal_number = int(input("Enter a decimal number (1-3999): "))

# Check if the input number is in the valid range
if 1 <= decimal_number <= 3999:
    roman_numeral = decimal_to_roman(decimal_number)
    print(f"Roman numeral representation of {decimal_number} is {roman_numeral}")
else:
    print("Invalid input! Please enter a number between 1 and 3999.")
