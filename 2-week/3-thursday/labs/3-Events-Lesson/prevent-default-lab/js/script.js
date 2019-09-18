document.querySelector('a').addEventListener('click', viewComments);
function viewComments(e) {
    // To access a property of the event object, we can use dot notation:
    const eventTarget = e.type;

    // Log the target to the console.
    console.log(eventTarget);
}
// function viewComments(e) {
//     // Add a class that fades the comments in by changing the opacity to 1.

//     // Prevent page from jumping to the top.
//     e.preventDefault();

//     document.querySelector('#comments').className = 'show-comments';
// }
