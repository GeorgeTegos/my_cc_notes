const square = function (num) {
  return num * num;
};

const double = function (num) {
  return num * 2;
};

const numbers = [1, 2, 3, 4, 5];
const squaredNumbers = [];

for (const number of numbers) {
  squaredNumbers.push();
}

const squaredNumbersMap = numbers.map(square);

// console.log(squaredNumbersMap);

const doubleSquaredNumbers = numbers.map(function (num) {
  return square(double(num));
});

// console.log(doubleSquaredNumbers);

const students = [
  {
    name: "Alice",
    age: 20,
    grade: "A",
    courses: ["Math", "Physics", "History"],
  },
  {
    name: "Bob",
    age: 22,
    grade: "C",
    courses: ["Computer Science", "English"],
  },
  {
    name: "Charlie",
    age: 21,
    grade: "B",
    courses: ["Biology", "Chemistry"],
  },
  {
    name: "Diana",
    age: 19,
    grade: "A",
    courses: ["Psychology", "Sociology"],
  },
  {
    name: "John",
    age: 70,
    grade: "A",
    courses: ["Psychology", "Sociology"],
  },
];

const studentNames = [];

for (const student of students) {
  studentNames.push(student.name);
}

const studentNamesMap = students.map(function (student) {
  return student.age;
});

// Take a list of temperatures in celsius and convert to fahrenheit
// C -> F - (celsius * 9/5) + 32

const temperatures = [0, 10, 25, 50];

const wrongheitTemperatures = temperatures.map(function (temperature) {
  let newTemperature = (temperature * 9) / 5 + 32;
  return newTemperature;
});

// console.log(wrongheitTemperatures);

// [1, 2, 3, 4, 5] -> [1, 3, 5]

const oddNumbers = numbers.filter(function (num) {
  if (num % 2 != 0) {
    return true;
  }
});

// console.log("Odd Numbers:");
// console.log(oddNumbers);

// Chained Methods
const gradeAStudents = students
  .filter(function (student) {
    return student.grade == "A";
  })
  .map(function (student) {
    return student.age;
  })
  .reduce(function (accumulator, age, index, { length }) {
    return accumulator + age / length;
  }, 0);

console.log("Grade A Students:");
console.log(gradeAStudents);

// const temperatures = [0, 10, 25, 50];

const hotTemperatures = temperatures
  .filter(function (temperature) {
    return temperature > 20;
  })
  .map(function (temperature) {
    return temperature * 2;
  });

// console.log(hotTemperatures);

// [1, 2, 3, 4, 5]

let total = 0;

for (const number of numbers) {
  total += number;
}

// console.log("Sum of numbers:");
// console.log(total);

// .reduce() - Method that iterates over the elements of an array and accumulates a single value,
// and returns the total

const sumOfNumbers = numbers.reduce(function (total, number) {
  return total + number;
}, 0);

// console.log("Sum with reduce:");
// console.log(sumOfNumbers);

const booleanList = [7, 5, 3, 2];

const booleanReduce = booleanList.reduce(function (accumulator, bool) {
  if (bool) {
    return accumulator + 1;
  } else {
    return accumulator + 5;
  }
}, 0);

let studentId;

studentId = "241235612";
console.log(studentId);

if (studentId) {
  console.log("Student Id Exists");
}

console.log("Bool sum:");
console.log(booleanReduce);
