package home.knightforthewin.models.chessPiece;

import home.knightforthewin.models.cell.Cell;
import home.knightforthewin.models.cell.VisitedCell;
import java.util.Queue;

/**
 * ChessPiece is an abstract class that represents the main state and behavior
 * of a chess piece.
 *
 * There are fields that represent starting position and target position as
 * coordinates x(position on a horizontal axis) and y(position on a vertical
 * axis).
 *
 * Chess piece has current position (VisitedCell) and it has a number of moves
 * that were made to reach it.
 *
 * @see home.knightforthewin.models.cell.VisitedCell
 * @see home.knightforthewin.models.cell.VisitedCell
 *
 * States of piece are stored in a queue and they are used from algorithm to
 * find the way from starting position to target position.
 *
 * @author Kolev
 */
public abstract class ChessPiece {

    /**
     * Represents starting cell of the chess piece.
     *
     * @see home.knightforthewin.models.cell.Cell
     */
    protected Cell startingCell;

    /**
     * Represents target cell of the chess piece.
     *
     * @see home.knightforthewin.models.cell.Cell
     */
    protected Cell targetCell;

    /**
     * Represents current cell of the chess piece. The moves that are made are
     * available in class VisitedCell.
     *
     * @see home.knightforthewin.models.cell.VisitedCell
     */
    protected VisitedCell currentCell;

    /**
     * States of piece are represented as queue of cells.
     *
     * They are used from chessboard`s algorithm to find the way from starting
     * position to target position.
     *
     * @see home.knightforthewin.models.cell.Cell
     */
    protected Queue<VisitedCell> statesOfPiece;

    /**
     * @return new cell which coordinates depend on passed cell coordinates and
     * new x and y coordinates.
     */
    public Cell moveCellToNewCoordinates(VisitedCell currentCell, int x, int y) {
        Cell nextCell = new Cell(currentCell.getX() + x + 1, currentCell.getY() + y + 1);
        return nextCell;
    }

    /**
     * @return starting cell of chess piece point
     */
    public Cell getStartingCell() {
        return startingCell;
    }

    /**
     * @param startingCell set the starting cell of chess piece
     */
    public void setStartingCell(Cell startingCell) {
        this.startingCell = startingCell;
    }

    /**
     * @return target cell of chess piece point
     */
    public Cell getTargetCell() {
        return targetCell;
    }

    /**
     * @param targetCell set the target cell of chess piece
     */
    public void setTargetCell(Cell targetCell) {
        this.targetCell = targetCell;
    }

    /**
     * @return current cell of the chess piece
     */
    public VisitedCell getCurrentCell() {
        return currentCell;
    }

    /**
     * @param currentCell set the value current cell of chess piece
     */
    public void setCurrentCell(VisitedCell currentCell) {
        this.currentCell = currentCell;
    }

    /**
     * @return queue of chess piece states
     */
    public Queue<VisitedCell> getStatesOfPiece() {
        return statesOfPiece;
    }

    /**
     * @param statesOfPiece set the value of states of piece.
     */
    public void setStatesOfPiece(Queue<VisitedCell> statesOfPiece) {
        this.statesOfPiece = statesOfPiece;
    }

}
