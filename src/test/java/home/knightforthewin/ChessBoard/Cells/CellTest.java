package home.knightforthewin.ChessBoard.Cells;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kolev
 */
public class CellTest {

    public CellTest() {
    }

    /**
     * Test of getX method, of class Cell.
     */
    @Test
    public void testGetX() {
        Cell cell = new Cell(1, 1);
        int actual = cell.getX();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of getX method, of class Cell.
     */
    @Test
    public void testGetX2() {
        Cell cell = new Cell(2, 1);
        int actual = cell.getX();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of getY method, of class Cell.
     */
    @Test
    public void testGetY() {
        Cell cell = new Cell(2, 1);
        int actual = cell.getY();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of getY method, of class Cell.
     */
    @Test
    public void testGetY2() {
        Cell cell = new Cell(2, 3);
        int actual = cell.getY();
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    /**
     * Test of hasSameCoordinatesAs method, of class Cell.
     */
    @Test
    public void testHasSameCoordinatesAs() {
        Cell firstCell = new Cell(2, 3);
        Cell secondCell = new Cell(2, 3);

        boolean actual = firstCell.hasSameCoordinatesAs(secondCell);
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    /**
     * Test of hasSameCoordinatesAs method, of class Cell.
     */
    @Test
    public void testHasSameCoordinatesAs2() {
        Cell firstCell = new Cell(2, 3);
        Cell secondCell = new Cell(3, 3);

        boolean actual = firstCell.hasSameCoordinatesAs(secondCell);
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

}
