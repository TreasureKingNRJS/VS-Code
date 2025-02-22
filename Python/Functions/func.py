def hello():
    print("hello")
hello()
v = 18
def h(name,age):
    print("Your name is " + name + " and your age is " + str(age))
n = input( "What is your name\n")
a = input("How old are you?\n")
h(n,a)
# put * to add infinite arguements
def ho(*data):
    print("Your name is " + data[0] + " and avoid " + data[1] + " and remain " + data[2] + " and attract " + data[3])
ho("Nithin","Chaleya","Sunshine","Neeya")
def he():
    v=9
    s=v
    v += 1
    print(v + s)
he()
def sam(name , age=20):
    #If age has no value .Then take 20
    print(name , age)
sam(age = 12,name = "John")
sam(name="Tata")
def sum(n1,n2):
    return n1+n2
print(sum(12,23))