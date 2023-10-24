const rps = (option1, option2) => {
  if (option1 == option2) {
    return "It's a tie";
  } else if (
    (option1 == "rock" && option2 == "scissors") ||
    (option1 == "paper" && option2 == "rock") ||
    (option1 == "scissors" && option2 == "paper")
  ) {
    return "Player 1 wins!";
  } else {
    return "Player 2 wins!";
  }
};

module.exports = rps;
