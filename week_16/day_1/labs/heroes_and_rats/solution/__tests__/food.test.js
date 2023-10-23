const Food = require('../src/Food');

describe( "Food", () => {

    let pizza;

    beforeEach(() => {
        pizza = new Food("Pizza", 20);
    })
    
    test("Food class is defined", () => {
        expect(Food).toBeDefined();
    });
      
    test("Food can be created", () => {
        expect(pizza).toBeDefined();
    });
      
    test("Food has correct properties", () => {
        expect(pizza.name).toBe("Pizza");
        expect(pizza.replenishmentValue).toBe(20);
    });

})