class f :
    def dis(self) :
        print("Bye")
        
class s() :
    def dis(self) :
        print("Go")

class t(f,s):
    def dis3(self):
        print("Away")
# multiple inheritance

x = t()
x.dis3()
x.dis()
x.dis()

#TO get what the order (left to right) (f to s)
print(t.mro())
