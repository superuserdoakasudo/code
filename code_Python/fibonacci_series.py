number = int(input("Enter the number of elements: "))
n1, n2 = 0, 1
print(n1, n2, end=" ")

for i in range(2, number):
    n3 = n1 + n2
    print(n3, end=" ")
    n1, n2 = n2, n3