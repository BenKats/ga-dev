// // Overview of the different ways of declaring objects and altering key/value pairs

// const myObject = {};

// function Classroom(name, numberOfStudents) {
//     this.name = name;
//     this.numberOfStudents = numberOfStudents;
// }

// const AMEX = new Classroom("AMEX", 25);

// const SEI = new Classroom("SEI", 45);

// const Person = {
//     type: "Human",
//     displayType: function() {
//         console.log(this.type);
//     }
// };

// const person1 = Object.create(Person);
// person1.displayType();

// const Person = { name: "Glinda" };
// Person.name = "Elphaba";

// const classroom = new Object();
// classroom.name = "History 101";
// classroom.campus = "NYC";

// classroom["name"];
// classroom["campus"];
// const input = "name";
// classroom[input] = "A different name";

const classroom = {
    name: "History 101",
    campus: "NYC",
    start: "1/1/2020",
    sayHello: function() {
        console.log(`This is ${this.name} and the class starts on ${this.start}`);
    }
};

classroom.sayHello();

const helloFunction = function() {
    console.log("This is going to be the best!");
};

classroom.sayHello = helloFunction;
classroom.sayHello();

// for ...in
// Object.keys(obj);
// Object.getOwnPropertyNames(obj);

const myCar = {
    make: "Ford",
    model: "mustang",
    year: 1969
};

const myCar2 = {
    make: "Toyota",
    mode: "Camry",
    year: 2004
};

// console.log(myCar.make);
// console.log(myCar.year);

function showProps(obj) {
    let result = "";

    for (let key in obj) {
        result += key + " = " + obj[key] + "\n";
    }
    return result;
}

console.log(showProps(myCar2));
console.log(showProps(myCar));

const student = { name: "Chris" };
const student2 = { name: "Chris" };

console.log(student == student2);
