// Loops Tasks
const bookPrices = [12.50, 10, 7.50, 15]


// Task 1: Use a for..of statement to loop through each price and log out each book
for (let price of bookPrices){
    console.log(price)
}

// Task 2: There's a sale at the bookstore, remove 10% from each book

// Loop, calculate 10%, remove value from price
// .toFixed(2) - Round to 2 decimal places
for (let i=0; i < bookPrices.length; i++){
    console.log(bookPrices[i])
    let tenPercent = bookPrices[i] * 0.1
    bookPrices[i] -= tenPercent
    console.log(bookPrices[i])
}


// Task 3: Use a while loop to check how many rolls of a die it takes to get a number

let target = 6
let attempts =0
let roll;

//WHILE ROLL IS NOT TARGET
    // ADD 1 TO ATTEMPT
    // SET ROLL TO RANDOM NUMBER FROM 1 TO 6
// LOG ATTEMPTS


while (roll != target){
    attempts++
    roll = Math.floor(Math.random()* 6)+ 1;
}   
console.log(`Attempts: ${attempts}`)
