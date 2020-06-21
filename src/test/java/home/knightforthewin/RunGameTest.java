package home.knightforthewin;

import home.knightforthewin.ChessBoard.Cells.Cell;
import home.knightforthewin.ChessBoard.ChessPieces.Knight;
import home.knightforthewin.modes.KnightForTheWin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kolev
 */
public class RunGameTest {

    public RunGameTest() {
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMain() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 1);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "4 moves were made to reach the far right hand bottom corner.";

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithValidInput() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 1);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "4 moves were made to reach the far right hand bottom corner.";

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithValidInput2() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 2);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "1 moves were made to reach the far right hand bottom corner.";

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithValidInput3() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 3);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "2 moves were made to reach the far right hand bottom corner.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithValidInput4() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(2, 2);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithInvalidInput() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 4);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithInvalidInput2() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(-14, 4);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithInvalidInput3() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(-14, 4123);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class RunGame.
     */
    @Test
    public void testMainMethodWithInvalidInput4() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(-12311, -12312);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

}
