// function buildName(name) {
//     let greeting = 'hello ' + name + '!';
//     let sayName = function() {
//         let welcome = greeting + 'Welcome!';
//         console.log(greeting);
//     };
//     return sayName;
// }

// var sayName = buildName('John');
// sayName();
// sayName();
// sayName();

function buildContor(i) {
    let contor = 1;
    let displayContor = function() {
        console.log(contor++);
        contor++;
    };

    return displayContor;
}

let myContor = buildContor(1);
myContor();
myContor();
myContor();
let otherContor = buildContor(10);
otherContor();
otherContor();
otherContor();

myContor();
