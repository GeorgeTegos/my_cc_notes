function isAnagram(str1, str2) {
    // Quick return for edge cases
    if ( str1.length !== str2.length ) return false;

    // Set up the frequency counter (frequency hash)
    const frequencyCounter = {};

    // We can loop round strings as if they were arrays
    for (let letter of str1) {

        // If the frequencyCounter already contains the
        // element as a key, increment it's value
        if(frequencyCounter[letter]) { // undefined and 0 are falsy
            frequencyCounter[letter] += 1;
        }
        // Else add a new key with the value of 1
        else{
            frequencyCounter[letter] = 1;
        }
    }

    // Loop round the second string
    // if the letter is in the frequencyCounter, decrement the value
    for (let letter of str2) {
        if (frequencyCounter[letter]){
            frequencyCounter[letter] -= 1;
        } 
    }

    /*
    For a valid anagram, we'd expect the frequencyCounter to
    have all values of 0

    {
        's': 0,
        'i': 0,
        'l': 0,
        'e': 0,
        'n': 0,
        't': 0
    }
    */

    // Check if every value is 0. Return true/false
    return Object.values(frequencyCounter).every( (count) => {
        return count == 0;        
    });
}

// Export the function using CommonJS
module.exports = isAnagram;