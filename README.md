# Snake Game

This project is a classic Snake Game implemented in Java using Swing and AWT libraries. The game follows the traditional rules: the snake grows longer as it eats apples, and the game ends if the snake collides with itself or the game board boundaries.

## Features
- Classic snake gameplay with increasing length as apples are eaten
- Randomly appearing apples on the board
- Game over detection on self-collision or hitting the board edge
- Simple, responsive controls using arrow keys
- Custom graphics for snake head, body, and apples

## Project Structure
- `index.java`: Main entry point. Sets up the game window and starts the game.
- `Board.java`: Contains the game logic, rendering, and controls.
- `icons/`: Contains images for the apple, snake head, and snake body (`apple.png`, `head.png`, `dot.png`).

## Requirements
- Java Development Kit (JDK) 8 or higher
- The `icons` folder with the required images must be present in the project directory

## How to Run
1. **Compile the code:**
   - Open a terminal in the project directory.
   - Run:
     ```
     javac index.java Board.java
     ```
2. **Run the game:**
   - Execute:
     ```
     java index
     ```

## Controls
- Use the **arrow keys** to control the direction of the snake:
  - **Left Arrow**: Move left
  - **Right Arrow**: Move right
  - **Up Arrow**: Move up
  - **Down Arrow**: Move down

## Gameplay
- The snake starts with a length of 3.
- Each time the snake eats an apple, it grows by one segment and a new apple appears at a random location.
- The game ends if the snake runs into itself or the edge of the board.
- A "Game Over!" message is displayed when the game ends.

## Java Concepts Used
- Core Java
- Swing and AWT for GUI
- Graphics for rendering
- Event handling (keyboard input)
- Object-Oriented Programming (OOP)
- Abstract classes and interfaces

## Credits
Developed by bluerabbit14
