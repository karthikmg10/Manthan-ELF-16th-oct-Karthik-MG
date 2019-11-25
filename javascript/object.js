var person={
    fname: "Raju",
    lname:'raj',
    age: 23,
    gender: 'M',
    eat: function(){
        console.log("Eating Biryani")
    },
    getFullName: function(){
        return this.fname+" "+this.lname;
    }
}

var firstname= person.fname;
var lastname=person.lname;
var age=person.age;
var gender=person.gender;
person.eat();
var fullname=person.getFullName();

console.log("firstname "+firstname)
console.log("lastname "+lastname)
console.log("age "+age)
console.log("gender "+gender)
console.log("full name "+fullname)