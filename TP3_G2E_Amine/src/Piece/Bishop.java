package Piece;

public class Bishop extends Piece{
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return false;
    }
    public String toString() {
        return "B";
    }
}
