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
