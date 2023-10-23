class Task {
    constructor(description, difficulty, urgency, completed = false) {
      this.description = description;
      this.difficulty = difficulty;
      this.urgency = urgency;
      this.completed = completed;
    }
  
    markAsCompleted() {
      this.completed = true;
    }
}

module.exports = Task;