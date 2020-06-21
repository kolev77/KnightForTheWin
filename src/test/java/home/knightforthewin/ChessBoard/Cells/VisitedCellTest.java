package home.knightforthewin.ChessBoard.Cells;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kolev
 */
public class VisitedCellTest {

    public VisitedCellTest() {
    }

    /**
     * Test of fromCell method, of class VisitedCell.
     */
    @Test
    public void testFromCell_Cell() {
        Cell cell = new Cell(1, 1);
        VisitedCell visitedCell = VisitedCell.fromCell(cell);
        boolean actual = cell.hasSameCoordinatesAs(visitedCell);
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    /**
     * Test of fromCell method, of class VisitedCell.
     */
    @Test
    public void testFromCell_Cell2() {
        Cell cell = new Cell(2, 3);
        VisitedCell visitedCell = VisitedCell.fromCell(cell);
        boolean actual = cell.hasSameCoordinatesAs(visitedCell);
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
    }

    /**
     * Test of fromCell method, of class VisitedCell.
     */
    @Test
    public void testFromCell_Cell_int() {
        Cell cell = new Cell(2, 3);
        VisitedCell visitedCell = VisitedCell.fromCell(cell, 2);
        boolean actual = cell.hasSameCoordinatesAs(visitedCell);
        boolean expected = true;
        Assertions.assertEquals(actual, expected);
        Assertions.assertEquals(visitedCell.getMoves(), 2);
    }

    /**
     * Test of getMoves method, of class VisitedCell.
     */
    @Test
    public void testGetMoves() {
        VisitedCell visitedCell = new VisitedCell(1, 1, 4);
        int actual = visitedCell.getMoves();
        int expected = 4;
        
        Assertions.assertEquals(expected, actual);
    }

}
