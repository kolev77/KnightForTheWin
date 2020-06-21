package home.knightforthewin.models.chessPiece;

import home.knightforthewin.models.chessPiece.Knight;
import home.knightforthewin.models.cell.Cell;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Kolev
 */
public class KnightTest {

    public KnightTest() {
    }

    /**
     * Test of getDIRECTIONS_ON_X method, of class Knight.
     */
    @Test
    public void testGetDIRECTIONS_ON_X() {
        Knight knight = new Knight(new Cell(1, 1));
        int[] actual = knight.getDIRECTIONS_ON_X();
        int[] expected = {-2, -1, 1, 2, -2, -1, 1, 2};

        Assertions.assertArrayEquals(actual, expected);
    }

    /**
     * Test of getDIRECTIONS_ON_Y method, of class Knight.
     */
    @Test
    public void testGetDIRECTIONS_ON_Y() {
        Knight knight = new Knight(new Cell(1, 1));
        int[] actual = knight.getDIRECTIONS_ON_Y();
        int[] expected = {-1, -2, -2, -1, 1, 2, 2, 1};

        Assertions.assertArrayEquals(actual, expected);
    }

}
