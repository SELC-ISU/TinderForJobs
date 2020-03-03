/* Conventional JavaScript functions.
 * Could also use arrow functions, but it's not necessary for this
 * level of simplicity
 */
function changeColor() {
    /* You can log things.  Kinda like a printf / System.out.print */
    console.log("Color changed");

    /* Getting whatever document is being referenced and then parsing for a specific element
     * ID or class */
    o = document.getElementById("square"); // o for object

    /* Just some math */
    var x = Math.floor(Math.random() * 256);
    var y = Math.floor(Math.random() * 256);
    var z = Math.floor(Math.random() * 256);


    /* Notice how we don't declare this guy's type */
    bgColor = "rgb(" + x + "," + y + "," + z + ")";


    o.style.backgroundColor = bgColor;
}


