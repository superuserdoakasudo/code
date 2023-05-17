use std::io;

fn main() {
    println!("Enter the number to check prime:");
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Failed to read line");
    let number: u32 = input.trim().parse().expect("Invalid input");

    let is_prime = is_prime(number);

    if is_prime {
        println!("Number is prime");
    } else {
        println!("Number is not prime");
    }
}

fn is_prime(number: u32) -> bool {
    if number <= 1 {
        return false;
    }

    let limit = (number as f64).sqrt() as u32;

    for i in 2..=limit {
        if number % i == 0 {
            return false;
        }
    }

    true
}