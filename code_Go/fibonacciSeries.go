package main

import "fmt"

func main() {
	var n1, n2, n3, number int

	fmt.Print("Enter the number of elements: ")
	fmt.Scan(&number)

	n1 = 0
	n2 = 1

	fmt.Print(n1, " ", n2)

	for i := 2; i < number; i++ {
		n3 = n1 + n2
		fmt.Print(" ", n3)
		n1 = n2
		n2 = n3
	}
}