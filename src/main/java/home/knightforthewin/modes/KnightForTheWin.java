package home.knightforthewin.modes;

import home.knightforthewin.ChessBoard.Cells.Cell;
import home.knightforthewin.ChessBoard.Cells.VisitedCell;
import home.knightforthewin.ChessBoard.ChessBoard;
import home.knightforthewin.ChessBoard.ChessPieces.Knight;

/**
 * KnightForTheWin is a class that represents state and behavior of specific
 * chess board game application. There is field that represent chess board and
 * methods that define rules of the game.
 *
 * @author Kolev
 */
public class KnightForTheWin {

    private static final String DEFAULT_SUCCESS_MESSAGE
            = " moves were made to reach the far right hand bottom corner.";

    private static final String DEFAULT_FAIL_MESSAGE
            = "There is no way to reach the target.";

    private static final String DEFAULT_START_MESSAGE
            = "Knight for the win is started.";

    private static final Cell DEFAULT_TARGET = new Cell(3, 3);
    private static final ChessBoard CHESS_BOARD = new ChessBoard();

    public KnightForTheWin() {
        System.out.println(DEFAULT_START_MESSAGE);
    }

    /**
     * Represents the start point of the game. Client needs to pass Knight.
     * After successful validation, another method starts processing different
     * options for next moves. When we find some path to the target, the method
     * print information about moves that were made, if the starting point of
     * the knight allows going to the target point.
     *
     * @see home.knightforthewin.ChessBoard.ChessPieces.Knight
     *
     * @param knight represents a Knight on the chessboard.
     */
    public String play(Knight knight) {
        try {
            this.prepareAndValidateKnight(knight);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return this.processingOtions(knight);

    }

    private String processingOtions(Knight knight) {
        int x, y;
        // clear visited cells
        this.CHESS_BOARD.clearVisitedCells();
        
        // loop through the states of knight while queue is not empty
        while (!knight.getStatesOfPiece().isEmpty()) {

            // Get first state of knight and set it as current cell
            knight.setCurrentCell(knight.getStatesOfPiece().poll());

            //Checks if current cell is equal to target cell. If it is,
            //game is finished and method prints the appropriate message.
            if (knight.getCurrentCell().hasSameCoordinatesAs(knight.getTargetCell())) {
                return this.returnMessage(knight.getCurrentCell().getMoves());
            }

            // loop through all optional knight directions
            for (int i = 0; i < 8; i++) {
                x = knight.getCurrentCell().getX() + knight.getDIRECTIONS_ON_X()[i];
                y = knight.getCurrentCell().getY() + knight.getDIRECTIONS_ON_Y()[i];
                Cell possibleNextCell = knight.moveCellToNewCoordinates(knight.getCurrentCell(), x, y);

                //if new coordinates are inside the chess board and the knight hasn`t visited it yet,
                // method adds the possible next cell in state of pieces for processing later options
                // and marks it as visited on the chess board.
                if (CHESS_BOARD.isInside(x, y) && !CHESS_BOARD.getVisitedCells()[x][y]) {

                    //Cell class subtracted 1 from passed coordinates in it`s constructor, because
                    //indices on chess board start from 0. This method add subtracted 1, to be
                    //able to work with coordinates correctly.   
                    VisitedCell currentCell
                            = new VisitedCell(x + 1, y + 1, knight.getCurrentCell().getMoves() + 1);
                    CHESS_BOARD.getVisitedCells()[x][y] = true;
                    knight.getStatesOfPiece().add(currentCell);

                    //Checks if current cell is equal to target cell. If it is,
                    //game is finished and method prints the appropriate message.
                    if (possibleNextCell.hasSameCoordinatesAs(knight.getTargetCell())) {
                        return this.returnMessage(currentCell.getMoves());
                    }
                }
            }
        }
        return this.returnMessage(-1);
    }

    /**
     * Invokes validateKnight method. After success, knight receive it`s first
     * state of piece (it`s starting point) and the default target is set.
     *
     * @see home.knightforthewin.modes.KnightForTheWin#validateKnight
     * @see home.knightforthewin.ChessBoard.ChessPieces.Knight
     *
     * @param knight represents knight on the chess board
     * @throws IllegalArgumentException
     */
    private void prepareAndValidateKnight(Knight knight) throws IllegalArgumentException {
        this.validateKnight(knight);
        knight.getStatesOfPiece().add(VisitedCell.fromCell(knight.getStartingCell()));
        knight.setTargetCell(DEFAULT_TARGET);
    }

    /**
     * Checks if starting point of knight is inside the chess board. If it is
     * not, then it throws IllegalArgumentException.
     *
     * @see home.knightforthewin.modes.KnightForTheWin#validateKnight
     * @param knight represents knight on the chess board
     * @throws IllegalArgumentException
     */
    private void validateKnight(Knight knight) throws IllegalArgumentException {
        if (!CHESS_BOARD.isInside(knight.getStartingCell().getX(), knight.getStartingCell().getY())) {
            throw new IllegalArgumentException("Starting position is outside the chess board.");
        }
    }

    /**
     * This method checks if value of moves is positive number. If it is, prints
     * message with number of moves and default message. If it is not, prints
     * default message for failure.
     *
     * @param moves represents number of moves
     */
    private String returnMessage(int moves) {
        if (moves >= 0) {
            return moves + this.DEFAULT_SUCCESS_MESSAGE;
        } else {
            return this.DEFAULT_FAIL_MESSAGE;
        }
    }

}
