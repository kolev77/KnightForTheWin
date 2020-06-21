package home.knightforthewin.games;

import home.knightforthewin.games.KnightForTheWin;
import home.knightforthewin.models.cell.Cell;
import home.knightforthewin.models.chessPiece.Knight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kolev
 */
public class KnightForTheWinTest {

    public KnightForTheWinTest() {
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethod() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 1);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "4 moves were made to reach the far right hand bottom corner.";

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithValidInput() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 1);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "4 moves were made to reach the far right hand bottom corner.";

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithValidInput2() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 2);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "1 moves were made to reach the far right hand bottom corner.";

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithValidInput3() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 3);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "2 moves were made to reach the far right hand bottom corner.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithValidInput4() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(2, 2);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithInvalidInput() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(1, 4);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithInvalidInput2() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(-14, 4);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithInvalidInput3() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(-14, 4123);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of play method, of class KnightForTheWin.
     */
    @Test
    public void testPlayMethodWithInvalidInput4() {
        KnightForTheWin knightForTheWin = new KnightForTheWin();
        Cell startingCell = new Cell(-12311, -12312);
        Knight knight = new Knight(startingCell);
        String actual = knightForTheWin.play(knight);
        String expected = "There is no way to reach the target.";
        Assertions.assertEquals(expected, actual);
    }

}
