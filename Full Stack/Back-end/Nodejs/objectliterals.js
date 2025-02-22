var Person = {name:"Nithin",age:15, display : function(){
    console.log(this.name)
}}

console.log(Person.name)
console.log(Person['name'])

for(x in Person){
    console.log(x)
    console.log(Person[x])
}
Person.disage= function(){
    console.log(this.age)
}
console.log(Person.display())
console.log(Person.disage())