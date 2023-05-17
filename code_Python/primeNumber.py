number = int(input("Enter the number to check prime: "))

if number > 1:
    is_prime = True
    for i in range(2, int(number/2) + 1):
        if number % i == 0:
            is_prime = False
            break

    if is_prime:
        print("Number is prime")
    else:
        print("Number is not prime")
else:
    print("Number is not prime")
