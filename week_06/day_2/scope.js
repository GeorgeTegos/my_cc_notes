// // // atm code unlocking
// // // and functions === variables?

// const isPinCorrect = function (someGuess) {
//     const secret = "1234";
//     let isCorrect;
//     if (secret === someGuess) {
//         console.log("yay");
//         isCorrect = true;
//     } else {
//         console.log("oh no");
//         isCorrect = false;
//     }
//     console.log(secret);
//     console.log(someGuess);
//     return isCorrect;
// };
// const myGuess = "1234";
// console.log(isPinCorrect(myGuess));
// console.log(myGuess);
// // console.log(secret);

// // filtering names

// const names = ["Pim", "Jim", "Tina", "Pat"];
// const letter = "P";

// const filterNames = function (arrayOfNames, firstLetter) {
//     const result = [];
//     for (var name of arrayOfNames) {
//         if (name[0] === firstLetter) {
//             result.push(name);
//         }
//     }
//     console.log(name);
//     return result;
// };

// console.log(filterNames(names, letter));
// // ["Pim", "Pat"]

// // changing unchangable

// let temperature = 30;

// if (temperature > 15) {
//     let jacket = false;
//     var happy = true;
// } else {
//     let jacket = true;
//     var happy = false;
// }

// // console.log("jacket after if-else blocks:", jacket);
// console.log("happy after if-else blocks:", happy);

// const names2 = ["Pim", "Jim", "Tina", "Pat"];
// // names2 = ["banana"];
// names2.pop();
// console.log(names2);


const names = ["Pim", "Jim", "Tina", "Pat"]
const letter = "P"

const filterNames = function(arrayOfNames, firstLetter){
    let arrayToReturn = []
    for (let name of arrayOfNames){
        if (name[0] === firstLetter)
            arrayToReturn.push(name)
    }
    return arrayToReturn
}

console.log(filterNames(names,letter))


