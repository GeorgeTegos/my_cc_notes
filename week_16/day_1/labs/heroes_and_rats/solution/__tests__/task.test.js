const Task = require('../src/Task');

describe("Task", () => {
    test("Task class is defined", () => {
        expect(Task).toBeDefined();
    });
    
    test("Task can be created", () => {
        const task = new Task("clean room", 2, 3);
        expect(task).toBeDefined();
    });
    
    test("Task has correct properties", () => {
        const task = new Task("clean room", 2, 3);
        expect(task.description).toBe("clean room");
        expect(task.difficulty).toBe(2);
        expect(task.urgency).toBe(3);
        expect(task.completed).toBe(false);
    });
    
    test("Task can be marked as completed", () => {
        const task = new Task("clean room", 2, 3);
        task.markAsCompleted();
        expect(task.completed).toBe(true);
    });
})