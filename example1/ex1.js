/* Conventional JavaScript functions.
 * Could also use arrow functions, but it's not necessary for this
 * level of simplicity
 */
function changeColor() {
    console.log("Color changed");
    o = document.getElementById("square");

    var x = Math.floor(Math.random() * 256);
    var y = Math.floor(Math.random() * 256);
    var z = Math.floor(Math.random() * 256);


    bgColor = "rgb(" + x + "," + y + "," + z + ")";


    o.style.backgroundColor = bgColor;
}


