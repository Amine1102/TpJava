package Piece;
public class Pawn extends Piece{
    public boolean isValidMove(Position newPosition, Cell[][] board) {
        return false;
    }
    public String toString() {
        return "P";
    }
}
