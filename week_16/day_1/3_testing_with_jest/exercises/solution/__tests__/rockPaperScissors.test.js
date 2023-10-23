// require the playRockPaperScissors function
const playRockPaperScissors = require('../rock_paper_scissors'); 

describe( 'playRockPaperScissors function', () => {
    // Test that the function returns "It's a tie!" when both players choose the same option:
    test('returns "It\'s a tie!" when both players choose the same option', () => {
        expect(playRockPaperScissors('rock', 'rock')).toBe("It's a tie!");
        expect(playRockPaperScissors('paper', 'paper')).toBe("It's a tie!");
        expect(playRockPaperScissors('scissors', 'scissors')).toBe("It's a tie!");
    });

    /*
        Test that the function returns "Player 1 wins!" when player 1 chooses rock and player 2 chooses scissors, 
        or when player 1 chooses paper and player 2 chooses rock, or when player 1 chooses scissors and player 2 
        chooses paper:
    */
    test('returns "Player 1 wins!" when player 1 wins', () => {
        expect(playRockPaperScissors('rock', 'scissors')).toBe('Player 1 wins!');
        expect(playRockPaperScissors('paper', 'rock')).toBe('Player 1 wins!');
        expect(playRockPaperScissors('scissors', 'paper')).toBe('Player 1 wins!');
    });
          

    // Test that the function returns "Player 2 wins." when player 2 wins:
    test('returns "Player 2 wins." when player 2 wins', () => {
        expect(playRockPaperScissors('scissors', 'rock')).toBe('Player 2 wins.');
        expect(playRockPaperScissors('rock', 'paper')).toBe('Player 2 wins.');
        expect(playRockPaperScissors('paper', 'scissors')).toBe('Player 2 wins.');
    });

    // Test that the function returns "Invalid choice" when an invalid choice is entered:
    test('returns "Invalid choice" when an invalid choice is entered', () => {
        expect(playRockPaperScissors('scalpel', 'rock')).toBe('Invalid choice.');
        expect(playRockPaperScissors('rock', 'phone')).toBe('Invalid choice.');
        expect(playRockPaperScissors('lizard', 'cat')).toBe('Invalid choice.');
    });
    

})