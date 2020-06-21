package home.knightforthewin.ChessBoard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kolev
 */
public class ChessBoardTest {

    public ChessBoardTest() {
    }

    /**
     * Test of isInside method, of class ChessBoard.
     */
    @Test
    public void testIsInside() {
        ChessBoard chessBoard = new ChessBoard();
        boolean actual = chessBoard.isInside(0, 0);
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsInside2() {
        ChessBoard chessBoard = new ChessBoard();
        boolean actual = chessBoard.isInside(-1, 0);
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsInside3() {
        ChessBoard chessBoard = new ChessBoard();
        boolean actual = chessBoard.isInside(3, 0);
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsInside4() {
        ChessBoard chessBoard = new ChessBoard();
        boolean actual = chessBoard.isInside(2, 2);
        boolean expected = true;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testIsInside5() {
        ChessBoard chessBoard = new ChessBoard();
        boolean actual = chessBoard.isInside(5, 7);
        boolean expected = false;

        Assertions.assertEquals(actual, expected);
    }

    /**
     * Test of clearVisitedCells method, of class ChessBoard.
     */
    @Test
    public void testClearVisitedCells() {
        ChessBoard chessBoard = new ChessBoard();
        boolean[][] visitedCells = chessBoard.getVisitedCells();
        visitedCells[0][0] = true;
        visitedCells[0][1] = true;
        visitedCells[0][2] = true;
        chessBoard.clearVisitedCells();
        boolean hasVisited = false;
        boolean expected = false;
        for (int i = 0; i < visitedCells.length; i++) {
            for (int j = 0; j < visitedCells.length; j++) {
                if (visitedCells[i][j]) {
                    hasVisited = true;
                }
            }
        }
        Assertions.assertEquals(hasVisited, expected);
    }

    /**
     * Test of getSize method, of class ChessBoard.
     */
    @Test
    public void testGetSize() {
        ChessBoard chessboard = new ChessBoard();
        int actual = chessboard.getSize();
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }
}
