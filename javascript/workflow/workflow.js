function first(callback){
    setTimeout(function(){
    console.log("first function executed")
    callback()
},3000)
}

console.log("hello good mrng")

function second(){
    console.log("second function executed")
}

first(second)
