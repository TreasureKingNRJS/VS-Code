class s :
    def n(self,name):
        self.name =  name
    def __add__(self,o):
        return self.name + " " + o.name
fn = s()
sn = s()
fn.n("Chaleya")
sn.n("Sunshine")

print(fn + sn)
#Replacing __add__ and +