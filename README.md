import random

def game():
    choices = ["rock", "paper", "scissors"]
    computer = random.choice(choices)

    user = input("Enter your choice (rock, paper, scissors): ").lower()

    while user not in choices:
        user = input("Invalid choice. Enter your choice (rock, paper, scissors): ").lower()

    print(f"\nComputer chose {computer}, you chose {user}.\n")

    if user == computer:
        return "It's a tie!"
    if (user == "rock" and computer == "scissors") or (user == "scissors" and computer == "paper") or (user == "paper" and computer == "rock"):
        return "You win!"
    return "Computer wins!"

print(game())