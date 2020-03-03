/* Error causing

if (true) {
    let name = 'Dogs, if statement';
}
console.log(name);

*/

console.log(name);

function myFunc() {
    let name = 'Dogs, functions';
    console.log('Inside the function');
}
myFunc();

console.log(name); /* Undefined */

/* We can also use const, which is block-scoped BUT we imply it won't be reassigned.
   It can be mutated however.
 */
