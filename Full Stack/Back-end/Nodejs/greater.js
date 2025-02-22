var i=require("readline-sync")
n1=i.question("Enter 2 numbers\n")
n2=i.question("")
q=12
q1="12"
console.log(q==q1)
console.log(q===q1)
if(n1>n2){
    console.log(n1)
}else if(n1<n2){
    console.log(n1)
}else{
    console.log(n1 + "=" + n2)
}