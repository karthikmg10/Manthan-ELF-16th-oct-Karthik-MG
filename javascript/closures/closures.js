function outer(){

    let a = 10;

    function inner() {
        console.log("a is ",10);
        
    }
    return inner;
}
let innerfunc = outer();
innerfunc();