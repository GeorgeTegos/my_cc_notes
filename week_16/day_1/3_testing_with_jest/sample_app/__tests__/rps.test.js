// Test that it returns correct result for a tie
const rps = require("../src/rps");

describe("rock paper scissors", () => {
  let player1 = "Player 1 wins!";
  let player2 = "Player 2 wins!";

  it("should return 'It's a tie' ", () => {
    expect(rps("rock", "rock")).toBe("It's a tie");
  });
  //   Input: 'rock', 'rock'
  //   Expected output: "It's a tie!"

  it("should return 'It's a tie' ", () => {
    expect(rps("paper", "paper")).toBe("It's a tie");
  });
  //   Input: 'paper', 'paper'
  //   Expected output: "It's a tie!"

  it("should return 'It's a tie' ", () => {
    expect(rps("scissors", "scissors")).toBe("It's a tie");
  });
  //   Input: 'scissors', 'scissors'
  //   Expected output: "It's a tie!"
  // Test that the function returns "Player 1 wins!" when player 1 chooses rock and
  // player 2 chooses scissors or when player 1 chooses paper and player 2 chooses rock, or when player 1 chooses scissors and player 2 chooses paper

  it("should return 'Player 1 wins!' ", () => {
    expect(rps("rock", "scissors")).toBe(player1);
  });
  //   Input: 'rock', 'scissors'
  //   Expected output: "Player 1 wins!"

  it("should return 'Player 1 wins!' ", () => {
    expect(rps("paper", "rock")).toBe(player1);
  });
  //   Input: 'paper', 'rock'
  //   Expected output: "Player 1 wins!"

  it("should return 'Player 1 wins!' ", () => {
    expect(rps("scissors", "paper")).toBe(player1);
  });
  //   Input: 'scissors', 'paper'
  //   Expected output: "Player 1 wins!"
  // Test that the function returns "Player 2 wins." when player 2 wins

  it("should return 'Player 2 wins!' ", () => {
    expect(rps("scissors", "rock")).toBe(player2);
  });
  //   Input: 'scissors', 'rock'
  //   Expected output: "Player 2 wins!"

  it("should return 'Player 2 wins!' ", () => {
    expect(rps("rock", "paper")).toBe(player2);
  });
  //   Input: 'rock', 'paper'
  //   Expected output: "Player 2 wins!"

  it("should return 'Player 2 wins!' ", () => {
    expect(rps("paper", "scissors")).toBe(player2);
  });
  //   Input: 'paper', 'scissors'
  //   Expected output: "Player 2 wins!"
});
