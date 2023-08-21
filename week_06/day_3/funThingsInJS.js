/*
------------------------
ARROW FUNCTIONS
------------------------
*/

const square = function (num) {
  return num * num;
};

const squareArrow = (num) => num * num;

const numbers = [1, 2, 3, 4, 5];

const doubleNumbers = numbers.map((num) => num * 2);

// Without arrow functions
// const doubleNumbers = numbers.map(function (num) {
//   return num * 2;
// });

console.log(doubleNumbers);

/*
------------------------
DESTRUCTURING
------------------------
*/

const raceFinishers = [
  "David",
  ["James", "Jack"],
  "Nicole",
  "Kyle",
  "John",
  "Mary",
  "Adam",
];

// const winner = raceFinishers[0];
// const second = raceFinishers[1];
// const third = raceFinishers[2];

const [winner, [secondJames, secondJack], third] = raceFinishers;

// console.log(winner, secondJames, secondJack, third);

const student = {
  name: "Jason",
  age: 24,
  grade: "B",
  height: "182cm",
  address: { name: "Fanduel", country: "Scotland" },
};

const teacher = {
  name: "Bob",
  age: 42,
  hairColour: "Brown",
};

const sayHello = ({ name: studentName, hairColour }) => {
  console.log(`Hello ${studentName}`);
  if (hairColour) {
    console.log(`Hair Colour is ${hairColour}`);
  }
};

sayHello(student);

/*
------------------------
SPREAD OPERATOR
------------------------
*/

const listOfNumbers = [1, 2, 3, 4, 5];

console.log(listOfNumbers);

console.log([20, ...listOfNumbers, 10]);

const addStudent = (students, student) => [
  ...students.filter((student) => student.grade == "A"),
  student,
];
