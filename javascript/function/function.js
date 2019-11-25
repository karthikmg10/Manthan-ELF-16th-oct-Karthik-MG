console.log("Named Function")

add(10,20)
function add(num1,num2){
    var sum=num1+num2
    console.log("sum "+sum)
}



console.log("======================================================")

console.log("Anonymous Function")
var multiply=function(n1,n2){
    var pro=n1*n2
    console.log("product ",pro)
}

multiply(24,43)

console.log("======================================================")

console.log("Self Invoked Function");

(function(s){
    var sq=s*s
    console.log("square ",sq)
})(10)

console.log("======================================================")

console.log("Arrow Function");
var divi=(val1,val2)=>{
    var div=val1/val2
    console.log("division ",div)
}

divi(25,5)

