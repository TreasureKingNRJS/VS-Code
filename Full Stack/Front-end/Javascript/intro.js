document.write("SVIP started");
//alert("GO AWAY");
console.log("OK");
document.write("<h1>TREASURE KING</h1>");
//This is a comment
/*
This is a multiline comment
*/
var per = null ;
document.write(typeof per + "<br>");
document.write("<br>");
document.write(per + "<br>");
document.write(23%8 + "<br>");
document.write((24 ** 3)  + "<br>");

var a = "30" , b = 30 ;
document.write((a == b) + "<br>");

a="30";
document.write((a === b) + "<br>");

document.write((a != b) + "<br>");

// OR "||"
// AND "&&"
// NOT "!"

function wish(n){
    document.write("<h1>Happy Birthday</h1>" + "<h1>" + n + "</h1>" + "<br>");
}

var nam = ["Nithin", "Treasure King", "Lion"];

document.write(nam);
nam[2] = "Tiger";
document.write("<br>"+nam);
document.write("<br>"+nam[1]);
document.write("<br>"+nam.length);
nam[5] = "Thanos";
nam.push("Cristiano", "Ronaldoooooo","Siiiuuuuuu");

for (var i = 0 ; i<nam.length ; i++){
    document.write("<br>"+nam[i]);
}
nam.shift();
nam.pop();
nam.splice(1,4);
nam.sort();

document.write("<br>");
for (var i = 0 ; i<nam.length ; i++){
    document.write("<br>"+nam[i]);
}
document.write("<br>");

var me = "Hello I'm Cristiano Ronaldo ";
document.write("<br>" + me.charAt(10) + "<br>" + nam[0].charAt(5) + "<br>" + me.concat(nam[2].toUpperCase()) + "<br>" + me.slice(6,19));

document.write( "<br>" + Math.sqrt(Math.sqrt(8**Math.round(2.5) * Math.pow(2,Math.ceil(2.13)))) + "<br>" + Math.abs(-129) + "<br>" + Math.min(Math.max(2,3,23,43,12,Math.floor(130.7)),241,342,6786));
document.write("<br>" + Math.ceil(100*Math.random()));

var id = document.getElementById("h1");
console.log(id);

document.write("<h1 id='h11' class='h3'></h1>");
document.getElementById("h11").innerHTML = "Treasure King Nithin";
document.getElementById("h11").style.color = "green";

document.write('<h1 class="h3"></h1>');
var clas = document.getElementsByClassName("h3");
console.log(clas);
clas[2].innerHTML = "TK";
clas[0].style.color = "brown";

console.log(document.getElementsByTagName("h2"));
var t = document.getElementsByTagName("h2");
console.log(t)

var tex = document.getElementsByName("key");
console.log(tex);



var one = 1;
function mes(){
    if(one==1){
        document.getElementById("h11").innerHTML= "It's too far for Ronaldo to think about that .......";
        one = 0;
    }else{
        document.getElementById("h11").innerHTML= "Treasure King Nithin";
        one = 1;
    }
}
function mess(){
    document.getElementById("box").innerHTML = "Hello " + document.getElementById("tx").value
}
document.write("<h1 id='box'></h1>")

var a = document.querySelectorAll("h1");
console.log(a);

a[0].innerHTML= "Test " + a[0].innerHTML ;
a[1].style.color = "red";

a = document.querySelectorAll(".hd");
console.log(a);
a[0].innerHTML= "Test " + a[0].innerHTML ;
a[1].style.color = "Blue";

document.querySelector("#he1").style.backgroundColor = "green";

var dis = ["N","JH"], i=0;


function disc(){
    
    dis[i] = document.createElement("h1");
    dis[i].innerHTML = "Discovered New Item";
    document.body.appendChild(dis[i]);
    i++;

}

function del(){
    i--;
    dis[i].remove();
}

var zt = document.getElementById("zl");
var btn = document.getElementById("btn");

btn.addEventListener("click", change);
zt.addEventListener("mouseover", bg);

function change(){
    zt.style.color = "white";
}

function bg(){
    zt.style.backgroundColor = "red";
}

let player = {
    name: "Ronaldo",
    position: "GOAT",
    goals: 891,
    details : function(){
        document.write("Name : " + this.name + "<br>" + "Position : " + this.position + "<br>" + "Goals : " + this.goals + "<br>")
    }
}
console.log(player)
document.write(player.position)

class Strike{
    constructor(name, position, goals){
        this.name = name;
        this.position = position;
        this.goals = goals;
        
    }
    details(){
            document.write("<br><br>Name : " + this.name + "<br>" + "Position : " + this.position + "<br>" + "Goals : " + this.goals + "<br>" + "<br>")
        }

}

let obj1 = new Strike("Ronaldo", "GOAT", 891) ;
let obj2 = new Strike("Messi", "GOAT", 833) ;
obj1.details()
obj2.details()

class Defend extends Strike {

}

let obj3 = new Defend("Ramos","Defender",77)
obj3.details()
