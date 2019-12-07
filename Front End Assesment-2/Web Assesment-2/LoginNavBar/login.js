function login(){
   
    var user = document.getElementById("email").value;
    var storedpass = localStorage.getItem(user);
    if(user=="")
    {
        signon.email.focus();
        return false;
    }
    if(storedpass == null)
    {
        alert("User does not exsist create new user.");
        window.location.href = "createaccount.html";
        return true;
    }
    var passw= document.getElementById("password").value;
    if(passw=="")
    {
        alert("password should not be empty");
        signon.password.focus();
        return false;
    }
    if(storedpass != passw)
    {
        alert("Invalid user.");
        return false;
    }else{
    window.location.href = "user.html";
    }
   
  }