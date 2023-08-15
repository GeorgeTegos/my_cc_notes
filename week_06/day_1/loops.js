let scores = [78, 32, 54, 23, 54, 35, 35];

// for (<start condition>; <break point>; <incremental>;)

// for (let i = 0; i < array.length; i++) {
//   console.log(array[i])
// }

// scores.length = 4
// Increment 1: i = 0
// Increment 2: i = 1
// Increment 3: i = 2
// Increment 4: i = 3
// EXIT LOOP

for (let i = 0; i < scores.length; i++) {
  console.log(scores[i]);
}

// for (key in object) - loop through the keys of object
// for (value of object) - loop through the values of object

// Array under the hood
/*
    {0: 78, 1: 32, 2: 54, 3: 23}
*/

// console.log(typeof scores);
// object

// Calculating the average of scores

let total = 0;

for (var score of scores) {
  total += score;
}

console.log(`Final Total: ${total}`);
let average = total / scores.length;

console.log(`Average: ${average.toFixed(1)}`);

// Add 1 to every score
for (let i = 0; i < scores.length; i++) {
  scores[i]++;
}

let num = 0
while (num < 10){
    console.log(num)
    num++
}