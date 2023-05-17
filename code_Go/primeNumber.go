package main

import "fmt"

func main() {
	var n, m, flag int
	fmt.Println("Enter the number to check prime:")
	fmt.Scanln(&n)
	m = n / 2

	for i := 2; i <= m; i++ {
		if n%i == 0 {
			fmt.Println("Number is not prime")
			flag = 1
			break
		}
	}

	if flag == 0 {
		fmt.Println("Number is prime")
	}
}
