function gerPersonInfo()
{
var users = JSON.parse(localStorage.getItem("users"));
console.dir(users.user[0]);
var user = users.user;
//JSON.parse(val));
var table = document.getElementById("registeredusers");
for (i = 0; i <= user.length; i++) {
var row = table.insertRow(1);
var cell1 = row.insertCell(0);
var cell2 = row.insertCell(1);
var cell3 = row.insertCell(2);

 cell1.innerHTML = user[i].name;
 cell2.innerHTML = user[i].email;
 cell3.innerHTML = user[i].mobile;
}
}
