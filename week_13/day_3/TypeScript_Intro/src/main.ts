// Number
let number: number = 10;

// String
let myName: string = "George";

// Boolean
let isWindy: boolean = true;

// Any
let apiResponse: any = {
    data:{
        "id":1,
        "name":"George"
    }
}

// Arrays
let numbers:number[] = [1,2,3,4,5];


// Type Definitions
type FizzBuzzType = string | number;

let fizzBuzz: FizzBuzzType[]= [1,2,"fizz",4,"buzz"];

// Functions
const add = (a:number ,b:number) => {
    return a+b;
}

add(5,5);

const sayHello = (name: string) =>{
    console.log(`Hello, ${name}`)
}

sayHello("George");

//                                 Return Type
const canBuyDrink = (age: number): boolean =>{
    return age >=18;
}

const squaredNumbers= (list: number[]) => {
    return list.map(number => number ** 2);
}

// ENUMS
enum Status {
    INCOMPLETE = 0,
    COMPLETE = 1,
}

const addTask = (name: string, status:Status) => {
    console.log(`Added ${name}: ${status}`);
}

addTask("TypeScript",Status.INCOMPLETE);

// Type Definitions 2
type Rating = 1 | 2 | 3 | 4 | 5 ;

const rateLesson = (lessonID:string | number ,rate:Rating) =>{
    console.log(`You rated ${lessonID}: ${rate}`)
}

rateLesson("TypeScript", 2);


// Objects And Interfaces
// Objects
type UserType={
    username: string;
    password: string | number;
}

const login = (details: UserType) =>{
    console.log(`You logged in as ${details.username}`)
}

const user = {
    username:"George",
    password:"123",
    age: 12
}

login(user);


// Interfaces
interface IUser {
    username: string;
    password: string | number;
}

const user2: IUser = {
    username:"jack sparrow",
    password: "arrrr"
};

interface IEmployee extends IUser {
    employee_id: string
}

const employee: IEmployee = {
    username:"Employee 1",
    password: "password",
    employee_id: "AXX1",
}

// Generics

const filter = <T> (numbers:T[], filterFunction:(num: T )=> boolean):T[] =>{
 return numbers.filter(filterFunction);
}

const evenNumbers = filter(numbers,(num) => num %2 == 0);

const words = ["snake", "Sausage", "Gareth","cabbage"]
const wordsStartingWithS = filter(words, (word)=> word[0] == "S");

interface Pair<T,U>{
    first: T;
    second: U;
}

const pairObj: Pair<string,string> = {
    first: "Hello",
    second: "World"
}

const pairObj2: Pair<number,string> ={
    first:10,
    second:"Hey"
}