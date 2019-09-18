// Add your event handlers here
const clickedRed = document.getElementById("redButton");
clickedRed.addEventListener("click", turnRed);
const clickedWhite = document.getElementById("whiteButton");
clickedWhite.addEventListener("click", turnWhite);
const clickedBlue = document.getElementById("blueButton");
clickedBlue.addEventListener("click", turnBlue);
const clickedYellow = document.getElementById("yellowButton");
clickedYellow.addEventListener("click", turnYellow);

function turnRed() {
    document.querySelector("body").className = "red-theme";
}
function turnWhite() {
    document.querySelector("body").className = "white-theme";
}
function turnBlue() {
    document.querySelector("body").className = "blue-theme";
}
function turnYellow() {
    document.querySelector("body").className = "yellow-theme";
}
