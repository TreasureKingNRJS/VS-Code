class student():
    year = 2023
    def __init__(self,name,age,place):#Works when object created
        print("Bye")
        self.name = name
        self.age = age
        self.place = place
    def adage(self):
        self.age += 1
    def relocate(self,place):
        self.place = place
    def display(self):
        print("Year : " + str(student.year))
        print("Name : " + self.name)
        print("Age : " + str(self.age))
        print("Place : " + self.place)
    @classmethod
    def yearad(cls):
        cls.year += 1
    @staticmethod
    def welcome():
        print("Welcome")

student.welcome()

x = student("Nithin",15,"Pallickal")
y = student("Jithin",22,"Kozhikode")

print("______________________________________")


x.display()

print("______________________________________")


y.display()

print("______________________________________")

student.year += 1
x.adage()
y.adage()

x.display()

print("______________________________________")

y.display()

print("______________________________________")

student.yearad()

x.adage()
y.adage()

x.relocate("Dubai")
y.relocate("Banglore")

x.display()

print("______________________________________")

y.display()

print("______________________________________")
