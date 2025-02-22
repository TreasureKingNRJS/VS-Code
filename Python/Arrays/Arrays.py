list=["Hello",35,"Nithin"]
set0={"School",18,"Shell"}
set1={"Hai",19,"Sulphur"}
set2={"I",35,"Nickel"}
#Tuple values cannot change
tuple=(1,2,3,4,5)
dict={
    "Name" : "Nithin Raj J S",
    "Email" : "jsnithinraj@gmail.com",
    "Phone" : "8848695205"
 }
set1.add("S")
print(list,set1.union(set2),tuple[0]+tuple[4]+list[1]+len(tuple),dict["Name"],len(dict))
for n in tuple:
    print("\n",n)
#list.clear()   (to make empty)
for n in list:
    print("\n",n)
# -1 in array for last data
print(list[-1])
#-2: second last to right side data
print(list[-2:])
print(list[2])
list += set0
#To append
list.append(input("Enter anumber \n"))



print(list)