package home.knightforthewin.ChessBoard.ChessPieces;

import home.knightforthewin.ChessBoard.Cells.Cell;
import home.knightforthewin.ChessBoard.Cells.VisitedCell;
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
