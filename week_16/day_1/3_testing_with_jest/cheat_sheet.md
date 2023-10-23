# Jest Cheat Sheet

The main documentation for Jest can be found <a href="https://jestjs.io/docs/getting-started">here</a>

## Getting started

```bash
# Create a new directory and cd into it before this command
npm init -y
npm install --save-dev jest
```

```bash
# Create directory structures
mkdir src
mkdir __tests__
```

Add the following section to your package.json:

```json
{
  "scripts": {
    "test": "jest"
  }
}
```

## Running tests

```bash
npm test
```

## isAnagram example

```js
// isAnagram.test.js
const isAnagram = require('./is_anagram');

describe("isAnagram function", () => {

    test('isAnagram function is defined', () => {
        expect(typeof isAnagram).toEqual('function');
    });

    test('"listen" is an anagram of "silent"', () => {
        expect(isAnagram('listen', 'silent')).toBeTruthy();
    });

    // ...etc
}
```

## Common Matchers

Full range of matchers <a href="https://jestjs.io/docs/expect">here</a>

- `toBe()` to test exact equality
- `toBeDefined()` to check that a variable is not undefined
- `toBeTruthy()` to check for truthiness (e.g. true)
- `toBeFalsy()` to check for falsiness
- `toStrictEqual()` to check the values of an object or array
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