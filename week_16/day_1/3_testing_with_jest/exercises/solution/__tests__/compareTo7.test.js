// require the compareTo7 function
const compareTo7 = require('../compare_to_7'); 

describe('compareTo7 function', () => {
  test('returns correct result for numbers less than 7', () => {
    expect(compareTo7(5)).toBe('5 is less than 7');
  });

  test('returns correct result for numbers equal to 7', () => {
    expect(compareTo7(7)).toBe('7 is equal to 7');
  });

  test('returns correct result for numbers greater than 7', () => {
    expect(compareTo7(8)).toBe('8 is greater than 7');
  });
});