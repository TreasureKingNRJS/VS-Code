class base :
    def __init__(self):
        print("Default")
    def s(self,name):
        self.name = name
        print("Base")
    

class sub(base):
    def __init__(self):
        super().__init__()#base.__init__(self)
        print("OKK")
    def w(self):
        print("Welcome")
    def n(self):
        print("Name : " + self.name)
    def s(self,name):
        super().s(name)
        print("Sub")

y = sub()#init overiding(across base)
y.s("NCS")
y.w()
y.n()