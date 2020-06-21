package home.knightforthewin.models.cell;

/**
 * Cell is an entity that represents every square on the chess board. An object
 * of type Cell contains two fields from type int (x and y). X represents the
 * position on a horizontal axis. Y represents the position on a vertical axis.
 *
 * @author Kolev
 */
public class Cell {

    /**
     * X represents the position on a horizontal axis.
     */
    protected int x;

    /**
     * Y represents the position on a vertical axis.
     */
    protected int y;

    /**
     * Creates a Cell with the specified x, y
     *
     * @param x the position on a horizontal axis
     * @param y the position on a vertical axis
     */
    public Cell(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    /**
     * @return the value of x (position on a horizontal axis)
     */
    public int getX() {
        return x;
    }

    /**
     *
     * Need to subtract 1, because client pass parameter between 1 and N, but
     * indices in our collections starts from 0 to N.
     *
     * @param x set the value of x (position on a horizontal axis).
     */
    protected void setX(int x) {
        this.x = x - 1;
    }

    /**
     * @return the value of y (position on a vertical axis)
     */
    public int getY() {
        return y;
    }

    /**
     * Need to subtract 1, because client pass parameter between 1 and N, but
     * indices in our collections start from 0 to N.
     *
     * @param y set the value of y (position on a vertical axis)
     */
    protected void setY(int y) {
        this.y = y - 1;
    }

    /**
     * @return Boolean value that give information about equality of coordinates
     * between two cells
     */
    public Boolean hasSameCoordinatesAs(Cell other) {
        if (getX() == other.getX() && getY() == other.getY()) {
            return true;
        }
        return false;
    }

}
