import funct
#from funct import NorP (To take only necessary function)
#import funct as f (substitute)
print(funct.__name__)
a = int(input("Enter a number for check\n"))
funct.NorP(a)
check = funct.NorP
check(a)
import platform
print(platform.system())
print(platform.processor())
print(platform.python_compiler())
print(platform.machine())
#Search for python mathematical modules
