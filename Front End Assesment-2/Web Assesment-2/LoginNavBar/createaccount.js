function regvalidate()
{
document.getElementById('nameerror').style.display='none';  
document.getElementById('emailerror').style.display='none';
document.getElementById('passworderror').style.display='none';
document.getElementById('newpassworderror').style.display='none';
document.getElementById('mobileerror').style.display='none';
document.getElementById('passwordInstr').style.display='none';


if((document.registerationform.name.value==""))
{
document.getElementById('nameerror').style.display='block';  
document.getElementById('nameerror').innerHTML = "Name should not be empty";
registerationform.name.focus();
return(false);
}

if(document.registerationform.email.value=="")
{
document.getElementById('emailerror').style.display='block';
document.getElementById('emailerror').innerHTML = "Email id requered";
registerationform.email.focus();
return(false);
}
else
{
if(!ValidateEmail(document.registerationform.email.value))
return false;

}

if(document.registerationform.password.value=="")
{
document.getElementById('passworderror').style.display='block';
document.getElementById('passworderror').innerHTML = "Please type a password";
registerationform.password.focus();
return(false);
}
else
{
if(!validatePassword(document.registerationform.password.value))
return false;
}
if((document.registerationform.password.value) != (document.registerationform.confirmpassword.value))
{
document.getElementById('newpassworderror').style.display='block';
document.getElementById('newpassworderror').innerHTML = "Password Must be equal";
registerationform.password.value = "";
registerationform.confirmpassword.value = "";
registerationform.password.focus();
return(false);
}
if(document.registerationform.mobile.value=="")
{
document.getElementById('mobileerror').style.display='block';
document.getElementById('mobileerror').innerHTML = "Please type a 10 digit number";
registerationform.mobile.focus();
return(false);
}
else
{
if(!mobilenovalid(document.registerationform.mobile.value))
return false;
}
setUserInfo();
return true;
}

function ValidateEmail(email)
{
var regexEmail = /\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*/;
if (regexEmail.test(email)) {
return true;

}else{
document.getElementById('emailerror').style.display='block';
document.getElementById('emailerror').innerHTML = "Invalid Email address";
document.getElementById('email').value="";
registerationform.email.focus();
return false;
}
}

function validatePassword(pass)
{
var str =  pass;
var decimal = /^(?=.*[0-9])(?=.*[!@#$%^&*\+_\[\]{}=()/:-\\;\'\"\s])[a-zA-Z0-9!@#$%^&*\+_\[\]{}=()/:-\\;\'\"\s]{6,}$/;
if(str.match(decimal))
{
return true;
}
else
{
registerationform.password.value = "";
registerationform.confirmpassword.value = "";
registerationform.password.focus();
document.getElementById('passwordInstr').style.display='block';
return false;
}
}


function mobilenovalid(inputtxt)
{
var phoneno = /^\d{10}$/;
if(inputtxt.match(phoneno))
return true;
else
{
document.getElementById('mobileerror').style.display='block';
document.getElementById('mobileerror').innerHTML = "Please type a 10 digit number";
return false;
}
}

function setUserInfo(){
if (localStorage.getItem("users") === null) {
var users = {};
var user = []
users.user = user;
}
else
{
var users = JSON.parse(localStorage.getItem("users"));
}
var newuser = { 'name': document.getElementById('name').value,'email':document.getElementById('email').value ,'password': document.getElementById('password').value,'mobile': document.getElementById('mobile').value};
users.user.push(newuser);

// Put the object into the storage
localStorage.setItem("users", JSON.stringify(users));
localStorage.setItem(document.getElementById('email').value, document.getElementById('password').value);
alert("Details saved successfully");
}


  


// function gerPersonInfo()
// {
// var retrievedObject = localStorage.getItem('person');
// alert(retrievedObject);
// alert('person: ' + JSON.parse(retrievedObject));
// var obj = JSON.parse(retrievedObject);
// alert(obj.name);
// //JSON.parse(val));

// }