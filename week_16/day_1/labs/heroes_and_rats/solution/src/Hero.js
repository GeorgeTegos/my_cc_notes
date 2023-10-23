class Hero {

    constructor(name, health, favouriteFood) {
      this.name = name;
      this.health = health;
      this.favouriteFood = favouriteFood;
      this.tasks = [];
    }
  
    eat(food) {
      if (food.poisonous) {
        this.health -= food.replenishmentValue;
      } else {
        if (food.name === this.favouriteFood.name){
          this.health += 1.5 * food.replenishmentValue;
        }else{
          this.health += food.replenishmentValue;
        }
      }
    }

    addTask(task) {
      this.tasks.push(task);
    }
    
    markAsCompleted(completedTask) { 
      for(let task of this.tasks) {
        if (task.description === completedTask.description) {
          task.markAsCompleted();
        }
      }
    }
  
    getCompletedTasks() {
      const completedTasks = [];

      for (let task of this.tasks) {
        if (task.completed) completedTasks.push(task);
      }

      return completedTasks;
    }
  
    getIncompleteTasks() {
      const incompleteTasks = [];

      for (let task of this.tasks) {
        if (!task.completed) incompleteTasks.push(task);
      }

      return incompleteTasks;
    }
  }
  
  module.exports = Hero;
