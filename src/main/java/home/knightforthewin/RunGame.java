package home.knightforthewin;

import home.knightforthewin.models.cell.Cell;
import home.knightforthewin.models.chessPiece.Knight;
import home.knightforthewin.games.KnightForTheWin;
import java.util.Scanner;

/**
 * RunGame represents application boot file. Knight for the win is chosen as a
 * game, so application needs chess board instance and knight instance. Passing
 * knight with starting cell to the game is enough to play.
 *
 * The chess board and knight could be used in different games.
 *
 * @author Kolev
 */
public class RunGame {

    public static void main(String[] args) { 
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = processInput();
        Knight knight = new Knight(startingCell);
        printOutput(knightForTheWin.play(knight));
    }

    /**
     * Process the input and generate cell with passed coordinates.
     */
    private static Cell processInput() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        return new Cell(x, y);
    }

    /**
     * Print the console output
     */
    public static void printOutput(String output) {
        System.out.println(output);
    }
}
