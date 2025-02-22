print("Enter 2 numbers and a operator\n")
a=input()
b=input()
c=input()

if c=="+":
    print("Result = ",a," + ",b," = ",a+b,"\n")
elif c=="-":
    if a<b:
        print("Result = ",b," - ",a," = ",b-a,"\n")
    else :
        print("Result = ",a," - ",b," = ",a-b,"\n")
elif c=="*":
    print("Result = ",a," * ",b," = ",a*b,"\n")
elif c=="/":
    print("Result = ",a," / ",b," = ",a/b,"\n")
else:
    print("Invalid entry\n")