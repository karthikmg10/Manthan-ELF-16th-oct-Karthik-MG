// var pElement = document.getElementById("demo");
// console.log(pElement)
// var text = pElement.textContent;
// console.log("Text of p ",text)
// pElement.textContent = "GOOOOD EVENINGGGGGG"
// var modifiedtext = pElement.textContent;
// console.log("modified text ",modifiedtext)
// var pElement = document.querySelector("#demo")
// console.log(pElement)
// var pElement = document.querySelector("p")
// pElement.textContent = "GOOOOOOD EVENINNG"
// console.log(pElement)



// var qElements = document.querySelectorAll(".test")
// qElements[1].style.color = "cyan"
// qElements[1].style.fontSize = "50px"
// qElements[1].style.fontFamily = "cursive"

var bElement = document.createElement("button")
bElement.textContent = "Click HERE!!!!!"
document.body.appendChild(bElement)

var p=document.createElement("p")
p.textContent="I AM A LAST CHILD "
document.body.appendChild(p)

document.write("GOOOOOOOOOOOOGLE")

var ele=document.getElementById("add")
// ele.className = 'abc'

ele.classList = 'abc xyz'
