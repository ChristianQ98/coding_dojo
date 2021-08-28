// ORIGINAL
    // document.getElementById("button").onclick = function() {
    //     setBackgroundColorById("paragraph", "blue");
    // }
// REFACTORED
const changeToBlue = document.getElementById("button").onclick = () => setBackgroundColorById("paragraph", "blue");


// ORIGINAL
    // document.getElementById("alert").onclick = function(){
    //     alert(document.getElementById("popup-input").value);
    // }
// REFACTORED
const popupAlert = document.getElementById("alert").onclick = () => alert(document.getElementById("popup-input").value);


// ORIGINAL
    // document.getElementById("hover-this").onmouseover = function(){
    //     setBackgroundColorById("body", "red");
    // }
// REFACTORED
const changeToRed = document.getElementById("hover-this").onmouseover = () => setBackgroundColorById("body", "red");


// ORIGINAL
    // document.getElementById("hover-this").onmouseout = function(){
    //     setBackgroundColorById("body", "white");
    // }
// REFACTORED
const changeToWhite = document.getElementById("hover-this").onmouseout = () => setBackgroundColorById("body", "white");


// ORIGINAL
    // function getValueFromId(id){
    //     return document.getElementById(id).value;
    // }
// REFACTORED
const getValueFromId = id => document.getElementById(id).value;


// ORIGINAL
    // function setBackgroundColorById(id, color){
    //     document.getElementById(id).style = "background-color: " + color;
    // }
// REFACTORED
const setBackgroundColorById = (id, color) => document.getElementById(id).style = "background-color: " + color;


// ORIGINAL
    // function mouseOverFunction(el){
    //     el.style = "background-color: black";
    // }
// REFACTORED
const mouseOverFunction = el => el.style = "background-color: black";