use std::io;

fn main() {
    println!("Enter the number of elements:");
    let mut input = String::new();
    io::stdin().read_line(&mut input).expect("Failed to read line");
    let number: u32 = input.trim().parse().expect("Invalid input");

    let (mut n1, mut n2) = (0, 1);
    print!("{} {} ", n1, n2);

    for _ in 2..number {
        let n3 = n1 + n2;
        print!("{} ", n3);
        n1 = n2;
        n2 = n3;
    }
}