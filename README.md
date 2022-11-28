[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-c66648af7eb3fe8bc4f294546bfd86ef473780cde1dea487d3c4ff354943c9ae.svg)](https://classroom.github.com/online_ide?assignment_repo_id=9483751&assignment_repo_type=AssignmentRepo)
# Puzzle Pegs

Implement Levitin Section 12.1 Exercise # 11: _Puzzle Pegs_ using a recursive backtracking algorithm. 

After carefully reading the problem statement, here are my thoughts.

You are asked to eliminate 14 pegs; I think you ought to aim to eliminate 13 pegs.  You are asked to find "a shortest sequence of moves" that leaves a single peg. Since each move eliminates one peg, I think that you'll be aiming to find a sequence of 13 moves. (Any "shorter sequence" would leave more than one peg remaining.*)  For this project, I have no requirement that you address a more general program, i.e., you need not create a program that works with larger or smaller or differently-shaped boards. (You _may_ want to do this anyway; ask if you're curious and I'll explain why in a separate post.)  

To satisfy the problem statement, you'll need to have a way to specify the starting location of the empty hole, and (optionally) the ending location of the last peg. My thought for this — no surprise — is to use command line arguments. The program should take two command line arguments: the first would specify the location of the empty hole, and the second would specify the desired position of the last peg. Number the pegs/holes from 1 to 15, starting at the top and continuing top-down, left–right, with 15 numbering the peg/hole at the bottom right. The arguments should be optional.  



* `PuzzlePegs 13 13` — would solve the problem in the book, leaving the last peg in the bottom-middle
* `PuzzlePegs 13` — would solve the problem, and leave the last peg anywhere  
* `PuzzlePegs `— with no arguments might as well default to the (immediately) above case

The next page has an example of "nice output" … basically a way to clearly see the moves, and the state of the board. This will be helpful to you when testing and debugging your program, and for me when grading it. We want a clear way to specify the moves, so something like "4-13" might indicate a first move where the peg in position 4 moves and occupies the hole at position 13, jumping over and eliminating the peg at position 8, and leaving a hole there. What will also be useful, for both you and me, is to provide a "graphical" representation, presumably using ASCII characters or symbols, of the board at the start, and after each move, so that it's easy to trace and verify the correctness of your program.

*One possible interpretation of Levitin's "shorter sequence" is to count double … or triple … jumps as one jump. I can't think of any other interpretation; can you? In any event, I don't want you to count double jumps specially for this assignment.




```
Initial board
    ●
   ● ●
  ● ● ●
 ● ● ● ●
● ● ○ ● ●
Moved 4 to 13, jumping over 8
    ●
   ● ●
  ○ ● ●
 ● ○ ● ●
● ● ● ● ●
Moved 1 to 4, jumping over 2
    ○
   ○ ●
  ● ● ●
 ● ○ ● ●
● ● ● ● ●
Moved 3 to 8, jumping over 5
    ○
   ○ ○
  ● ○ ●
 ● ● ● ●
● ● ● ● ●
Moved 7 to 2, jumping over 4
    ○
   ● ○
  ○ ○ ●
 ○ ● ● ●
● ● ● ● ●
Moved 10 to 3, jumping over 6
    ○
   ● ●
  ○ ○ ○
 ○ ● ● ○
● ● ● ● ●
Moved 12 to 5, jumping over 8
    ○
   ● ●
  ○ ● ○
 ○ ○ ● ○
● ○ ● ● ●
Moved 13 to 6, jumping over 9
    ○
   ● ●
  ○ ● ●
 ○ ○ ○ ○
● ○ ○ ● ●
Moved 2 to 9, jumping over 5
    ○
   ○ ●
  ○ ○ ●
 ○ ○ ● ○
● ○ ○ ● ●
Moved 3 to 10, jumping over 6
    ○
   ○ ○
  ○ ○ ○
 ○ ○ ● ●
● ○ ○ ● ●
Moved 15 to 6, jumping over 10
    ○
   ○ ○
  ○ ○ ●
 ○ ○ ● ○
● ○ ○ ● ○
Moved 6 to 13, jumping over 9
    ○
   ○ ○
  ○ ○ ○
 ○ ○ ○ ○
● ○ ● ● ○
Moved 14 to 12, jumping over 13
    ○
   ○ ○
  ○ ○ ○
 ○ ○ ○ ○
● ● ○ ○ ○
Moved 11 to 13, jumping over 12
    ○
   ○ ○
  ○ ○ ○
 ○ ○ ○ ○
○ ○ ● ○ ○
