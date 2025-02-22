
class s {
    hai(){
        console.log("Hai")
    }
}


class n extends s{
    
    constructor(n,m){
        super()
        this.n=n
        this.m=m
    }
    print(){
        console.log(this.n+this.m)
    }
}
let t = new n(12,32)
t.print()
t.hai()