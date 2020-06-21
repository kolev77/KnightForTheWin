package home.knightforthewin.ChessBoard;

/**
 * ChessBoard is a class that represents state and behavior of chess board in
 * this application. There are fields that represent size of chess board and
 * their visited cells. There is a DEFAULT size, defined by current task.
 *
 * @author Kolev
 */
public class ChessBoard {

    /**
     * Represents default value for chess board
     */
    private static final int DEFAULT_SIZE = 3;

    /**
     * Represents the size of chess board
     */
    private int size;

    /**
     * Represents visited cells
     */
    private boolean[][] visitedCells;

    /**
     * Creates a ChessBoard with the default size(3x3)
     */
    public ChessBoard() {
        this.size = DEFAULT_SIZE;
        this.visitedCells = new boolean[DEFAULT_SIZE][DEFAULT_SIZE];
    }

    /**
     * Creates a ChessBoard with custom size and could be used for different
     * scenarios.
     *
     * @param size represents custom size.
     */
    public ChessBoard(int size) {
        this.size = size;
        this.visitedCells = new boolean[size][size];
    }

    /**
     * Checks if passed coordinates are inside the chessboard.
     *
     * @param x represents point on horizontal axis
     * @param y represents point on vertical axis
     *
     * @return <code>true</code> if coordinates are inside.
     */
    public Boolean isInside(int x, int y) {
        if (x >= 0 && x < this.size && y >= 0 && y < this.size) {
            return true;
        }
        return false;
    }

    /**
     * Clear visited cells. All cells are set to false.
     */
    public void clearVisitedCells() {
        for (int i = 0; i < visitedCells.length; i++) {
            for (int j = 0; j < visitedCells.length; j++) {
                visitedCells[i][j] = false;
            }
        }
    }

    /**
     * @return the size of chess board
     */
    public int getSize() {
        return size;
    }

    /**
     * @return chess board cells. Visited cells have  <code>true</code> as a
     * value, unvisited have - <code>false</code>.
     */
    public boolean[][] getVisitedCells() {
        return visitedCells;
    }

}
