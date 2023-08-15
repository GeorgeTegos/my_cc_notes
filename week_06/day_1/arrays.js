let students = ["Jason", "John", "Holly"];

console.log(students);
let fizzBuzz = [1, 2, "Fizz", 4, "Buzz", "Fizz", 7];
console.log(fizzBuzz);

let courses = [
  ["Bruschetta", "Calimari"], // Starters
  ["Beans on Toasts", "Steak and Chips"], // Mains
  ["Trifle", "Cheesecake"], // Desserts
];

// Get the length of an array
console.log(students.length);

// Accessing and modifying items in an array
console.log(students[2]);
console.log(courses[1][0]);

courses[1][0] = "Beans on Toast w/ Cheese";

console.log(courses);

let johnIndex = students.indexOf("John");
console.log(johnIndex);

students = [
  { name: "Jason", age: 24 },
  { name: "Bob", age: 100 },
  { name: "Jane", age: 19 },
];

// console.log(students.find((student) => student.name == "Bob"));

/*
    END OF ARRAY
    array.push(item) - Add item to the end of array
    array.pop() - Remove last item from the array

    START OF ARRAY
    array.unshift(item) - Add item to the start of the array
    array.shift() - Remove first item from the array
*/

let lotteryNumbers = [12, 5, 7, 10, 22, 9];
lotteryNumbers.push(10);
lotteryNumbers.shift();
lotteryNumbers.unshift(8);
lotteryNumbers.pop();

console.log(lotteryNumbers);




