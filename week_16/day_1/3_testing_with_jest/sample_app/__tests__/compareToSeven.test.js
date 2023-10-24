// We have a function called compareTo7 that returns a string. Your task is to test that it fulfills the following cases:
// import { compareToSeven } from "../src/compareToSeven";
const compareToSeven = require("../src/compareToSeven");

describe("Compare to seven is function", () => {
  test("is function is defined", () => {
    expect(typeof compareToSeven).toEqual("function");
  });

  // Returns correct result for numbers less than 7
  it('should return "5 is less than 7"', () => {
    expect(compareToSeven(5)).toBe("5 is less than 7");
  });
  // Input: 5, Expected output: "5 is less than 7"
  // Returns correct result for numbers equal to 7

  it('should return "7 is equal to 7" ', () => {
    expect(compareToSeven(7)).toBe("7 is equal to 7");
  });
  // Input: 7, Expected output: "7 is equal to 7"
  // Returns correct result for numbers greater than 7

  it('should return "8 is greater than 7"', () => {
    expect(compareToSeven(8)).toBe("8 is greater than 7");
  });
  // Input: 8, Expected output: "8 is greater than 7"
});
