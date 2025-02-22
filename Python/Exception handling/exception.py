b=0
try:
    a=10/b
    print(a)
    print("try completed")
except ZeroDivisionError:
    print("Not defined")
print("Program completed")