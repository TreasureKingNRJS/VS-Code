def recursion(n):
    if n <= 1:
        return n
    else :
        return n + recursion (n - 1)
a = int(input("Enter a number to find all sum of numbers below it(positive numbers)\n"))
print(str(a*(a+1)/2) + " is the sum of numbers below " + str(a))
print(str(recursion(a)) + " is the sum of numbers below " + str(a))