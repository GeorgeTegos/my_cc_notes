const Rat = require('../src/Rat');
const Food = require('../src/Food');

let rat;
let pizza;

describe("Rat", () => {

    pizza = new Food("Pizza", 20);
    rat = new Rat("Remy");

    test("Rat class and rat is defined", () => {
        expect(Rat).toBeDefined();
        expect(rat).toBeDefined();
    });

    test("Rat has correct name", () => {
        expect(rat.name).toBe("Remy");
    });

    test("Rat can touch food", () => {
        rat.touchFood(pizza);
        expect(pizza.poisonous).toBe(true);
    });

})