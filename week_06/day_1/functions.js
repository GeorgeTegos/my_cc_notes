function greetPerson(name) {
    console.log(`Hello ${name}`);
  }
  
  let greet = greetPerson("Jason");
  function square(number) {
    return number * number;
  }
  
  let squareOfTwo = square(5);
  
  function multiply(num1, num2) {
    return num1 * num2;
  }
  
  let twoTimesFour = multiply(2, 4);
  
  console.log(twoTimesFour);
  
  let students = [];
  
  function addStudent(name, age, average_score = 0) {
    console.log(name, age);
    let student = {
      name,
      age,
      average_score,
    };
    students.push(student);
    return student;
  }
  
  let jason = addStudent("Jason", 24);
  addStudent("Bob", 100, 72.4);
  console.log(students);