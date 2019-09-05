// // Monkeying Around
// function Monkey(name, species, foodsEaten) {
//     this.name = name;
//     this.species = species;
//     this.foodsEaten = foodsEaten;
//     this.eatSomething = function(foodString) {
//         this.foodsEaten.push(foodString);
//     };
//     this.introduce = function() {
//         console.log(
//             `Hello my name is ${this.name} and I am a ${this.species}, I've also eaten: ${this.foodsEaten}`
//         );
//     };
//     this.excercise = function() {
//         for (const key in this) {
//             const value = this[key];
//             console.log(key + " " + value);
//         }
//     };
// }

// // console.log(monkey.foodsEaten);
// // monkey.excercise();
// monkey1 = new Monkey("George", "Chimpanze", ["Bananas"]);
// monkey2 = new Monkey("Michael", "Baboon", ["Apples"]);
// monkey3 = new Monkey("Rick", "Howler Monker", ["Nuts"]);
// monkey1.eatSomething("bird");
// console.log(monkey1.excercise());
// console.log(monkey2.excercise());
// console.log(monkey3.excercise());

// Person Class Additional Practice
// Using an object constructor, write an object 'Person' that has a name
// an age, a favorite food, and an array of favorite movies.
// Write methods for the object that will print out the person's
// name, age, and favorite food, and write a method to add a movie to
// the person's favorite movies.

function Person(name, age, favFood, movies) {
    this.name = name;
    this.age = age;
    this.favFood = favFood;
    this.movies = movies;
    this.aboutMe = function() {
        console.log(
            `Hello, my name is ${name}, I am ${age} years old and my favorite food is ${favFood}`
        );
    };
    this.addMovie = function(movie) {
        this.movies.push(movie);
    };
}
