console.log(window)
console.log(this)
console.log(window === this)
var a =10;
console.log("a = ",a)
console.log("with window ",window.a)

function add(){
    console.log("add method")
}
add()
window.add()

// alert("This site may contain harmful content")

// confirm("Are you 18 years old")

prompt("Enter your age") 