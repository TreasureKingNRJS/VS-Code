class MyClass:
    def hello(self,n):
        #Variable making
        self.name = n
        print("Hello " + n)
    def printname(self):
        print(self.name)

# Object making (Down)
x = MyClass()
y = MyClass()

name = "Nithin"
x.hello(name)
y.hello("Afnan")

MyClass.hello(x,name)
x.printname()
y.printname()
