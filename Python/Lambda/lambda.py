#Lambda func also anonymous func
# Infinite arguement but one expression
def s(x):
    return x*x
print(s(18))
x = lambda x: x*x
print(x(5))
#____________________________________________
list_ = [2,4,3,1,6,5]
def even(x):
    if x % 2 == 0:
        return x
f = filter(even,list_)
h = filter(lambda x : x % 2 == 0 , list_)
print(list(f))
print(list(h))