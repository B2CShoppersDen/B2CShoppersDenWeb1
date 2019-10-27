var attempt = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
var username = document.getElementById("userName").value;
var password = document.getElementById("password").value;
if ( username == "ram" && password == "ram123"){
alert ("Login successfully");
window.location = "customerLogin.html"; // Redirecting to other page.
return true;
}
else{
attempt --;// Decrementing by one.
alert("You have left "+attempt+" attempt;");
// Disabling fields after 3 attempts.
if( attempt == 0){
document.getElementById("userName").disabled = true;
document.getElementById("password").disabled = true;
document.getElementById("submit").disabled = true;
return false;
}
}
}