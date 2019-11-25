let person = {
    name : "karthik",
    age : 23,
    hobbies : ["dancing","riding"]
}

let {name,age} = person;
console.log("age",age);

console.log("*********************************************************");
displayName(person)
function displayName({name,age}){
    console.log(name);
    console.log(age);
    
    
}

console.log("************ARRAY DESTRUCTURE******************");
let hobbies = ["danicng","riding","sleeping"]
let [hobby0,hobby1]=hobbies
console.log(hobby0);
console.log(hobby1);

console.log("**************SpreadOperators*****************");
let items = [
            {
                id : 1,
                name : "bag",
                price : 400
            },
            {
                id : 2,
                name : "shoe",
                price : 1200
            }
            ]
        console.log("Items ",items);
        items[0].id= 5;
        console.log("AFTER MODIFICATION ", items);
        
      var item = {...items[0] }
      console.log("item 0 ",items);
      item.id = 20
      console.log("items ",items);
      console.log("item 0 ",item );

console.log("*************REST OPERATOR*************");

function sum(...args){
    let value = 0;
    for(let i=0;i<args.length;i++){
        value += args[i];
    }
    console.log(value);
    
}
sum(10,20,30)


      
        
