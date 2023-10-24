const compareToSeven = (number) => {
  if (number < 7) {
    return `${number} is less than 7`;
  } else if (number === 7) {
    return `${number} is equal to 7`;
  } else {
    return `${number} is greater than 7`;
  }
};

module.exports = compareToSeven;
