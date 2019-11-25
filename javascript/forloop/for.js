var hobbies=["Sleeping","eating","Travling","coding","Trekking"]
console.log("---------using for loop----------------")

for(var i=0;i<hobbies.length;i++){
    console.log(hobbies[i])
}

console.log("---------using for of loop----------------")

for(var hobby of hobbies){
    console.log(hobby)
}

console.log("---------using for in loop----------------")

for(var hobby in hobbies){
    console.log(hobbies[hobby])
}

var employee={
    name:'Avinash',
    age:24,
    color:'fair',
    phone:6789887688,
    hobbies:["travelling","cooking","sleeping"]
}

// var name=employee["name"];
// console.log("Name "+name)

console.log("---------using for in loop for objects----------------")

for(var key in employee){
    console.log(employee[key])
}