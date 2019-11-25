function validateForm(){
let usernameEle = document.forms["loginForm"]['userName']
let passwordEle = document.forms["loginForm"]['password']
if(usernameEle.value.trim().length > 5){
        let pEle = document.getElementById("pele")
        pEle.style.display = "none"

    } else{
        let pEle = document.getElementById("pele")
        pEle.style.display = "block"
    }

    if(passwordEle.value.trim().length >5){
        let pwd = document.getElementById("pwd")
        pwd.style.display = "none"
    } else {
        let pwd = document.getElementById("pwd")
        pwd.style.display = "block"
    }

    if(usernameEle.value.trim().length > 5 && passwordEle.value.trim().length >  5)
    {
        alert("DATA SAVED SUCESSFULLY")
        document.getElementById("loginForm").reset();
    } else {
        alert("DATA NOT SAVED")
    }
    
}
