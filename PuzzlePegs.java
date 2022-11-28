// In collaboration with Hannah, Mei-Rose, and Phoenix.

public class PuzzlePegs {
    private static final char peg = 'P'; // Represents Pegs (Done) '\u25CF'
    private static final char hole = 'H'; // Represents Holes (Done) '\u25CB'

    /* Done */
    // 2D array representing all possible moves
    private static final int[][] moves = {
            { 1, 2, 4 },
            { 1, 3, 6 },
            { 2, 4, 7 },
            { 2, 5, 9 },
            { 3, 5, 8 },
            { 3, 6, 10 },
            { 4, 2, 1 },
            { 4, 5, 6 },
            { 4, 7, 11 },
            { 4, 8, 13 },
            { 5, 8, 12 },
            { 5, 9, 14 },
            { 6, 3, 1 },
            { 6, 5, 4 },
            { 6, 9, 13 },
            { 6, 10, 15 },
            { 7, 4, 2 },
            { 7, 8, 9 },
            { 8, 5, 3 },
            { 8, 9, 10 },
            { 9, 5, 2 },
            { 9, 8, 7 },
            { 10, 6, 3 },
            { 10, 9, 8 },
            { 11, 7, 4 },
            { 11, 12, 13 },
            { 12, 8, 5 },
            { 12, 13, 14 },
            { 13, 12, 11 },
            { 13, 8, 4 },
            { 13, 9, 6 },
            { 13, 14, 15 },
            { 14, 13, 12 },
            { 14, 9, 5 },
            { 15, 10, 6 },
            { 15, 14, 13 }
    };

    // Board History (Linked List?)


    // Jumps History (Linked List?)


    // Starting hole location
    int startLoc = 1;

    // Ending hole location - (optional)

    /**
     * Constructor
     *
     * @param startLoc The starting location of the hole
     */
    PuzzlePegs(int startLoc) throws IllegalArgumentException {
        // Assign starting hole location
        if (!maintainBounds(startLoc)) {
            throw new IllegalArgumentException("Invalid starting hole, must be range from 1 to 15.");
        } else {
            this.startLoc = startLoc;
        }

        // Initiate board and jump history
    }

    /**
     * Checks if argument value is between 1 and 15
     *
     * @param argValue
     */
    private static boolean maintainBounds(int argValue) {
        if ((argValue >= 1) && (argValue <= 15)) {
            return true;
        } else {
            return false;
        }
    }

    public void solve() {
        // build board

        // solve puzzle
        // print the moves and output
    }

    private void solveRecur(char[] board) {
        // go through every possible move
        // match PPH pattern
        // record board history


    }

    /* public char[] buildBoard() {
        char[] board = new char[16];
        board[0] = ' '; // Unused Null Space
        for (var i = 1; i < board.length; i++) {
            if (startLoc == i) {
                board[i] = hole;
            } else {
                board[i] = peg;
            }
        }

        return board;
    } */

    /* Done */
    private static void printBoard(char[] Board) {
        System.out.println("    " + Board[1]);
        System.out.println("   " + Board[2] + " " + Board[3]);
        System.out.println("  " + Board[4] + " " + Board[5] + " " + Board[6]);
        System.out.println(" " + Board[7] + " " + Board[8] + " " + Board[9] + " " + Board[10]);
        System.out.println(Board[11] + " " + Board[12] + " " + Board[13] + " " + Board[14] + " " + Board[15]);
    }


    public static void main(String[] args) {

        printBoard(buildBoard());
    }
}

