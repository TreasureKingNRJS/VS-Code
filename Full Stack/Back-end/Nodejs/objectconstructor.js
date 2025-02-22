function Person(name,age){
    this.name = name
    this.age  = age
    this.display = function(){
        console.log("Name : " + this.name + "\n" + "Age : " + this.age)
    }
    this.display()
}
var details = new Person("Nithin",15)
var details1 = new Person("Treasure",10000)
Person("Nithin",15)

details.display()
details1.display()