class person{
    constructor(name,age){
        this.name = name;
        this.age = age
    }
    getName(){
        return this.name
    }
}

const person1 = new person("Karthik",23)
const person2 = new person("dambo",23)
console.log(person1.name);
let pName =person2.getName()
console.log("person2 name ",pName);

console.log("--------------------------------------------");

class teacher extends person{
    constructor(name,age,subject){
        super(name,age)
        this.subject = subject
    }
    getsubject(){
        return this.subject
    }
}
const teacher1 = new teacher("thoubha",34,"c programmming")
const teacher2 = new teacher("dinga",33,"java")
const subj = teacher2.getsubject();
console.log(subj);



