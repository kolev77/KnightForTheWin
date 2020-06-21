package home.knightforthewin.ChessBoard.Cells;

/**
 * VisitedCell is an entity that represents every visited square on the chess
 * board. It extends Cell behavior and add one more field for moves that are
 * made from chess piece to be at it`s current position.
 *
 * @author Kolev
 */
public class VisitedCell extends Cell {

    /**
     * Moves represents how many moves are made to reach the current cell.
     */
    private int moves;

    /**
     * Creates a VisitedCell with the specified x, y and moves
     *
     * @param x the position on a horizontal axis
     * @param y the position on a vertical axis
     * @param moves made moves to reach the current cell
     */
    public VisitedCell(int x, int y, int moves) {
        super(x, y);
        this.moves = moves;
    }

    /**
     * @return instance of VisitedCell created from instance of class Cell. Cell
     * class subtracted 1 from passed coordinates in it`s constructor, because
     * indices on chess board start from 0. This method add subtracted 1, to be
     * able to work with coordinates correctly.
     *
     * @param cell represents passed cell. This method is going to make a
     * VisitCell from it and set moves to 0.
     */
    public static VisitedCell fromCell(Cell cell) {
        return new VisitedCell(cell.getX() + 1, cell.getY() + 1, 0);
    }

    /**
     * @return instance of VisitedCell created from instance of class Cell. Cell
     * class subtracted 1 from passed coordinates in it`s constructor, because
     * indices on chess board start from 0. This method add subtracted 1, to be
     * able to work with coordinates correctly.
     *
     * @param cell represents passed cell. This method is going to make a
     * VisitCell from it.
     *
     * @param moves represents moves that are made to the current cell
     */
    public static VisitedCell fromCell(Cell cell, int moves) {
        return new VisitedCell(cell.getX() + 1, cell.getY() + 1, moves);
    }

    /**
     * @return the value of moves
     */
    public int getMoves() {
        return moves;
    }

    /**
     * @param moves set the value of made moves
     */
    public void setMoves(int moves) {
        this.moves = moves;
    }

}
