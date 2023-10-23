function playRockPaperScissors(player1, player2) {
    // The possible choices for the game
    const choices = ['rock', 'paper', 'scissors'];

    // Check for invalid choices
    if (!choices.includes(player1) || !choices.includes(player2)) return "Invalid choice.";
  
    // Determine the winner
    if (player1 === player2) {
      return "It's a tie!";
    } else if (
      (player1 === 'rock' && player2 === 'scissors') ||
      (player1 === 'paper' && player2 === 'rock') ||
      (player1 === 'scissors' && player2 === 'paper')
    ) {
      return 'Player 1 wins!';
    } else {
      return 'Player 2 wins.';
    }
}

module.exports = playRockPaperScissors;