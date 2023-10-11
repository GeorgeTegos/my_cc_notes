"use strict";
// Number
let number = 10;
// String
let myName = "George";
// Boolean
let isWindy = true;
// Any
let apiResponse = {
    data: {
        "id": 1,
        "name": "George"
    }
};
// Arrays
let numbers = [1, 2, 3, 4, 5];
let fizzBuzz = [1, 2, "fizz", 4, "buzz"];
fizzBuzz.forEach(item => {
    if (typeof item == typeof " ") {
        console.log("Test");
    }
    else {
        console.log(typeof item);
    }
});
// Functions
const add = (a, b) => {
    return a + b;
};
add(5, 5);
const sayHello = (name) => {
    console.log(`Hello, ${name}`);
};
sayHello("George");
//                                 Return Type
const canBuyDrink = (age) => {
    return age >= 18;
};
const squaredNumbers = (list) => {
    return list.map(number => number ** 2);
};
// ENUMS
var Status;
(function (Status) {
    Status[Status["INCOMPLETE"] = 0] = "INCOMPLETE";
    Status[Status["COMPLETE"] = 1] = "COMPLETE";
})(Status || (Status = {}));
const addTask = (name, status) => {
    console.log(`Added ${name}: ${status}`);
};
addTask("TypeScript", Status.INCOMPLETE);
const rateLesson = (lessonID, rate) => {
    console.log(`You rated ${lessonID}: ${rate}`);
};
rateLesson("TypeScript", 2);
const login = (details) => {
    console.log(`You logged in as ${details.username}`);
};
const user = {
    username: "George",
    password: "123",
    age: 12
};
login(user);
const user2 = {
    username: "jack sparrow",
    password: "arrrr"
};
const employee = {
    username: "Employee 1",
    password: "password",
    employee_id: "AXX1",
};
// Generics
const filter = (numbers, filterFunction) => {
    return numbers.filter(filterFunction);
};
const evenNumbers = filter(numbers, (num) => num % 2 == 0);
const words = ["snake", "Sausage", "Gareth", "cabbage"];
const wordsStartingWithS = filter(words, (word) => word[0] == "S");
const pairObj = {
    first: "Hello",
    second: "World"
};
const pairObj2 = {
    first: 10,
    second: "Hey"
};
const test = {
    greetings: () => console.log("hello")
};
