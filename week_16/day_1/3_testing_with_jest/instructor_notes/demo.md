# Testing with Jest

## Overview 

   By the end of this part, students should know how to:

   - Run tests
   - Use matchers
   - Use describe for grouping
   - TDD
   - Set up and teardown

## I Do

<a href="https://jestjs.io/docs/getting-started">Getting started</a>

<a href="../cheat_sheet.md">Student cheat sheet</a>

Jest is a JavaScript testing framework designed to ensure correctness of any JavaScript codebase. It allows you to write tests with an approachable, familiar and feature-rich API that gives you results quickly.

## What's the Problem?

The isAnagram function appears to work correctly but we need to write tests to confirm. Sometimes code is updated or changed and our tests should still pass. The kind of testing we will be doing is called unit testing.

Students should be aware of the <a href="https://martinfowler.com/articles/practical-test-pyramid.html">testing pyramid</a>

## What do I test?

- Positive results: Expected outputs for a valid input
- Negative results: Expected outputs for an invalid input
- Edge cases: Expected outputs for valid input at the extremes of valid values


## TDD

In addition, Test-Driven Development is a method of approaching a problem by writing small unit tests first *before* writing the code. This helps us in several ways including guiding us to a full solution step-by-step.

## Basic step by step

input - expected output - assert the result

1. Create a test file for your function or class
2. Import the function or class to the test file
3. Give a description to each test
4. Call the function with a given input
5. Test that the function returns the expected output

## I Do

Build the sample app.

```bash
npm init -y
npm install --save-dev jest
```

```json
// Update the test script in package.json

{
  "scripts": {
    "test": "jest"
  }
}
```

```bash
# Run the tests

npm test
```

## Common Matchers

Jest uses "matchers" to let you test values in different ways. You should use the matcher that most precisely corresponds to what you want your code to be doing.

Full range of matchers <a href="https://jestjs.io/docs/expect">here</a>

The most common matchers are:

- `toBe()` to test exact equality
- `toBeDefined()` to check that a variable is not undefined
- `toBeTruthy()` to check for truthiness (e.g. true)
- `toBeFalsy()` to check for falsiness
- `toStrictEqual()` to test that objects have the same types as well as structure
- `toContain()` to check if an array contains a value

For numbers:

- `toBeGreaterThan()`
- `toBeGreaterThanOrEqual()`
- `toBeLessThan()`
- `toBeLessThanOrEqual()`
- `toBeCloseTo()` to check floating point numbers

You can also test for the opposite of a matcher using not:

EG:

- `not.toBeTruthy()`
- `not.toBe()`


## You Do

Give the students some time to work through the exercises.

## I Do - TDD

Test-Driven Development

- Writing the tests first  
- Intentionally thinking more about the code design leads to better code
- The name comes from the idea of the tests driving the development process

### Red, Green, Refactor

- Red -> Write a failing test
- Green -> Make it pass by writing the code
- Refactor -> Make the code better (if possible)


## You Do

Modify the `rockPaperScissors` function code to deal with the possibility of an invalid choice being entered. 

Add another test block for player 1 and/or player 2 entering an invalid choice. Remember, write the test first, watch it fail, make it pass, refactor if necessary.


## Setup and Teardown

Often while writing tests you have some setup work that needs to happen before tests run, and you have some finishing work that needs to happen after tests run. Jest provides helper functions to handle this.

Example:

```js
describe( 'City database', () => {

  // make sure we have fresh data in the database before each test
  beforeEach(() => {
    initializeCityDatabase();
  });

  // make sure the database is cleared out after each test
  afterEach(() => {
    clearCityDatabase();
  });

  test('city database has Vienna', () => {
    expect(isCity('Vienna')).toBeTruthy();
  });

  test('city database has San Juan', () => {
    expect(isCity('San Juan')).toBeTruthy();
  });

})

```

## Skipping tests

You can skip tests:

```js

xit('should return true given "listen" and "silent"', () => {
  expect(isAnagram('listen', 'silent')).toBeTruthy();
});

// OR

test.skip('"listen" is an anagram of "silent"', () => {
  expect(isAnagram('listen', 'silent')).toBeTruthy();
});

```