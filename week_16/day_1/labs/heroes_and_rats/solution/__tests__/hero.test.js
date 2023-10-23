const Hero = require('../src/Hero');
const Food = require('../src/Food');
const Task = require('../src/Task');
const Rat = require('../src/Rat');

describe("Hero", () => {

    let pizza;
    let task1;
    let task2;
    let myHero;
    let rat;

    beforeEach(() => {
        grapes = new Food("Grapes", 20);
        pizza = new Food("Pizza", 3);
        task1 = new Task("Attack the minotaur", 3, 2);
        task2 = new Task("Make it home", 1, 1);
        myHero = new Hero("Theseus", 10, grapes);
        myHero.addTask(task1);
        myHero.addTask(task2);
        rat = new Rat("Remy");
    })

    test("Hero class is defined", () => {
        expect(Hero).toBeDefined();
        expect(myHero).toBeDefined();
    });

    test("Hero can output name", () => {
        expect(myHero.name).toBe("Theseus");
    });

    test("Hero can eat food", () => {
        pizza = new Food("Pizza", 2);
        myHero.eat(pizza);
        expect(myHero.health).toBe(12);
    });

    test("Hero can mark task as completed", () => {
        myHero.markAsCompleted(task1);
        expect(task1.completed).toBe(true);
    });

    test("Hero can return completed tasks", () => {
        myHero.markAsCompleted(task1);
        expect(myHero.getCompletedTasks()).toEqual([task1]);
    });

    test("Hero can return incompleted tasks", () => {
        expect(myHero.getIncompleteTasks()).toEqual([task1, task2]);
    });

    test("Hero that eats poisonous `Food` should lose health equal to the replenishment value of the food", () => {
        rat.touchFood(pizza);
        myHero.eat(pizza);
        expect(myHero.health).toBe(7);
    })
})