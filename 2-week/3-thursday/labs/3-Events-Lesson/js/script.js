//function to call when the user click on the button
const alertUser = function() {
    prompt("Welcome user");
};
// select the buttoon element from the document
const button = document.querySelector("button");
button.addEventListener("click", alertUser);
