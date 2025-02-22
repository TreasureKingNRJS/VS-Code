print("Welcome")
#TO print module name(funct)
print(__name__)
def NorP(n):
    if(n<0):
        print(str(n) + " is negative")
    elif(n>0):
        print(str(n) + " is positive")
    elif(n==0):
        print(str(n) + " is zero")
    else:
        print("Invalid Entry")
