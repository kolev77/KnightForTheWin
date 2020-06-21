package home.knightforthewin.models.chessPiece;

import home.knightforthewin.models.chessPiece.ChessPiece;
import home.knightforthewin.models.chessPiece.Knight;
import home.knightforthewin.models.cell.Cell;
import home.knightforthewin.models.cell.VisitedCell;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kolev
 */
public class ChessPieceTest {

    public ChessPieceTest() {
    }

    /**
     * Test of moveCellToNewCoordinates method, of class ChessPiece.
     */
    @Test
    public void testMoveCellToNewCoordinates() {
        ChessPiece piece = new Knight(new Cell(1, 1));
        piece.setCurrentCell(VisitedCell.fromCell(piece.getStartingCell(), 0));
        Cell cell = piece.moveCellToNewCoordinates(piece.getCurrentCell(), -2, -1);
        boolean actual = true;
        boolean expected = true;
        if (cell.getX() != -2 && cell.getY() != -1) {
            actual = false;
        }
        Assertions.assertEquals(actual, expected);
    }

    /**
     * Test of moveCellToNewCoordinates method, of class ChessPiece.
     */
    @Test
    public void testMoveCellToNewCoordinates2() {
        ChessPiece piece = new Knight(new Cell(2, 2));
        piece.setCurrentCell(VisitedCell.fromCell(piece.getStartingCell(), 0));
        Cell cell = piece.moveCellToNewCoordinates(piece.getCurrentCell(), 2, 1);
        boolean actual = true;
        boolean expected = true;
        if (cell.getX() != 3 && cell.getY() != 2) {
            actual = false;
        }
        Assertions.assertEquals(actual, expected);
    }

    /**
     * Test of moveCellToNewCoordinates method, of class ChessPiece.
     */
    @Test
    public void testMoveCellToNewCoordinates3() {
        ChessPiece piece = new Knight(new Cell(4, 2));
        piece.setCurrentCell(VisitedCell.fromCell(piece.getStartingCell(), 0));
        Cell cell = piece.moveCellToNewCoordinates(piece.getCurrentCell(), -1, 2);
        boolean actual = true;
        boolean expected = true;
        if (cell.getX() != 2 && cell.getY() != 3) {
            actual = false;
        }
        Assertions.assertEquals(actual, expected);
    }

}
