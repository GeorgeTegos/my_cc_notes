class Rat {
    constructor(name) {
      this.name = name;
    }
  
    touchFood(food) {
      food.poisonous = true;
    }
}

module.exports = Rat

