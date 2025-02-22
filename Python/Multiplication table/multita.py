i = int(input("Enter a number for displaying multiplication table and number for how much multiples you want\n"))
a = int(input())
for x in range(a):
    print(str(x + 1) + " * " + str(i) + " = " + str((x + 1)*i))
