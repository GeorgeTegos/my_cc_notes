// Require the function using CommonJS
const isAnagram = require('../src/is_anagram');

describe("isAnagram function", () => {

    test('isAnagram function is defined', () => {
        expect(typeof isAnagram).toEqual('function');
    });

    // we can use 'it' instead of 'test' if it makes the description more readable
    // 'it' is an alias of 'test'
    it('should return true given "listen" and "silent"', () => {
        expect(isAnagram('listen', 'silent')).toBe(true);
    });

    test('"foo" is not an anagram of "bar"', () => {
        expect(isAnagram('foo', 'bar')).toBe(false);
    });

    test('"anagram" is an anagram of "nagaram"', () => {
        expect(isAnagram('anagram', 'nagaram')).toBe(true);
    });

    test('"qwerty" is not an anagram of "qwertz"', () => {
        expect(isAnagram('qwerty', 'qwertz')).toBe(false);
    });

    test('"abcd" is an anagram of "dcba"', () => {
        expect(isAnagram('abcd', 'dcba')).toBe(true);
    });

});