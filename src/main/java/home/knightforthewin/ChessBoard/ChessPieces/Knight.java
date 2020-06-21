package home.knightforthewin.ChessBoard.ChessPieces;

import home.knightforthewin.ChessBoard.Cells.Cell;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Knight is a class that represents state and behavior of knight and extends
 * ChessPiece abstract class.
 *
 * Possible directions of knight are represented by two arrays of coordinates. X
 * as position on a horizontal axis and Y as position on vertical axis. Knight
 * has eight different options to move in best case. They are described as pairs
 * of coordinates (x,y). To simulate all knight`s moves,which are in a shape
 * similar to the uppercase of "L", we need to iterate over (two arrays) the
 * pairs of possible coordinates. For every option, we need to add current
 * possible coordinates to current cell`s coordinates. If the new coordinates
 * are inside the chess board, then we add this move to state of chess piece for
 * processing.
 *
 * @see home.knightforthewin.Chess.ChessPieces.ChessPiece#statesOfPiece
 * @see home.knightforthewin.ChessBoard.ChessPieces.ChessPiece
 * @author Kolev
 */
public class Knight extends ChessPiece {

    /**
     * Represents possible positions on X (horizontal axis)
     */
    private static final int[] POSSIBLE_POSITION_ON_X = {-2, -1, 1, 2, -2, -1, 1, 2};

    /**
     * Represents possible positions on Y (vertical axis)
     */
    private static final int[] POSSIBLE_POSITION_ON_Y = {-1, -2, -2, -1, 1, 2, 2, 1};

    /**
     * Creates a Knight with the specified starting point
     *
     * @param startingCell starting cell
     */
    public Knight(Cell startingCell) {
        this.startingCell = startingCell;
        super.statesOfPiece = new LinkedBlockingQueue<>();
    }

    /**
     * @return possible positions on a horizontal axis
     */
    public int[] getDIRECTIONS_ON_X() {
        return POSSIBLE_POSITION_ON_X;
    }

    /**
     * @return possible positions on a vertical axis
     */
    public int[] getDIRECTIONS_ON_Y() {
        return POSSIBLE_POSITION_ON_Y;
    }

}
