package Piece;
public class Queen extends Piece {
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return false;
    }
    public String toString() {
        return "Q";
    }
}
