let pEle = document.createElement("p")
function greet(message){
    let name = "Bill Gates"
    //alert(message + " " + name)
    alert(`${message} ${name}`);
    
}

function ChangeFont(){

    let element =  document.getElementById("test")
    element.style.fontSize = "50px"
}

function ChangeFontToOLd(){

    let element = document.getElementById("test1")
    element.style.fontsize = "20px"
}

function Showdata(){
    let element = getElementById('up').innerText;
    console.log("no of key pressed");
    
}

function showElement(){
    
    pEle.textContent = "create p Element"
    document.body.appendChild(pEle)
    
}

let el = document.getElementById("tes")
// // el.onclick = function(){
// //     alert("clicked")
// }

el.addEventListener('Click',function(){
    alert("CLICKED!!!!")
})
