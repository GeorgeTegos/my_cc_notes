# Heroes & Rats Lab

The task is to build the beginnings of an adventure game using Test-Driven Development. That means we write our tests first, one by one, watch them fail and then fix the code to make the test pass.

First, set up your directory structure and install Jest.

[Cheat Sheet](../2_testing_with_jest/cheat_sheet.md)

## Features

Here's our specification:

### Food class
- A `Food` should have a name
- A `Food` should have a replenishment value  

### Task class
- A `Task` should have a description
- A `Task` should have a difficulty level
- A `Task` should have and urgency level
- A `Task` should be able to be marked as completed. It should initially be false.

### Hero class
- A `Hero` should have a name
- A `Hero` should have a health level
- A `Hero` should have a favourite `Food`
- A `Hero` has an array of `Tasks` to complete
- A `Hero` should be able to eat `Food`, and health should go up by the replenishment value. If the `Food` is their favourite `Food`, their health should go up by 1.5 * replinishment value
- A `Hero` should be able to mark a `Task` as completed
- A `Hero` should be able to return `Tasks` that are marked as completed or incomplete  


## Extensions

These features are more ambiguous and require you to make some decisions about your classes, methods and what to test.

- Add a new class of `Rat`
- `Rats` should be able to touch `Food`, if they do the `Food` becomes poisonous
- `Heroes` that eat poisonous `Food` should lose health equal to the replenishment value of the food.