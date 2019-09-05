// function printItems() {
//     console.log("Item1");
//     console.log("Item2");
//     console.log("Item3");
//     menu();
// }

// function menu() {
//     console.log("===Menu===");
// }

// printItems();

// function welcomeUser(username, password) {
//     if (username === "Ben" && password === "yellow") {
//         console.log(`Welcome ${username}`);
//     } else {
//         console.log("Incorrect username or password");
//     }
// }

// welcomeUser("Ben", "yellow");

// function userLogin(...args) {
//     console.log(args);
// }

// userLogin(1, 2, 34, 20);

// // Anonymous function
// const speak = function() {
//     console.log("Hi");
// };

// speak();

// // arrow fucntion
// const speak = words => {
//     console.log(words);
// };

// speak("Hi There");

// function add(num1, num2) {
//     return num1 + num2;
// }

// let total = add(10, 20);
// console.log(total);

// let name = "john";
// function printName() {
//     let b = "local Var";
// }

// console.log(name);

// if (name === "john") {
//     let x = 10;
// } else {
//     let y = 20;
// }

// let firstName = "John";
// let lastName = "Dowd";
// let age = 19;

// function displayPerson(fname, lname) {
//     let prefix = " Mr";
//     let fullName = null;

//     function getFullName() {
//         let suffix = "Esq.";
//         return (fullName = `${prefix} ${fname} ${lname} ${suffix}`);
//     }

//     return getFullName();
// }

// function removeYears() {
//     let minusYears = 10;
//     let age = 49;
//     return age - minusYears;
// }

// console.log(displayPerson(firstName, lastName));
// console.log(removeYears());

// console.log(console.log(this.document === document));
// this.aValue = "SEI";
// console.log(window.aValue);

const lenghts = function lengths(strArr) {
    const lenArr = [];
    strArr.forEach(word => {
        lenArr.push(word.length);
    });
    return lenArr;
};

console.log(lenghts(["a", "aa", "aaa"]));

const transmorgifier = (num1, num2, num3) => {
    let product = num1 * num2;
    return Math.pow(product, num3);
};

console.log(transmorgifier(5, 4, 3));

const wordReverser = str => {
    strArr = str.split(" ");
    strReversed = strArr.reverse();
    return strReversed.join(" ");
};

console.log(wordReverser("hello world!"));
