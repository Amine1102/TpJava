import java.util.Scanner;

public class Chess {
    private Cell[][] board;
    private Player[] players;
    private Player currentPlayer;

    public void setCurrentPlayer(Player currentPlayer) {this.currentPlayer = currentPlayer;}
    public Player getCurrentPlayer() {return this.currentPlayer;}

    public void play(){
        while (true){
            createPlayers();
            initialiseBoard();
            while (!isCheckMate()){
                printBoard();
                String move;
                do {
                    move = askMove();
                }
                while (!isValidMove(move));
                updateBoard(move);
                switchPlayer();
            }
        }
    }
    public void createPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saissiez le joueur 1 : ");
        String joueur1 = scanner.nextLine();
        System.out.println("Saissiez le joueur 2 : ");
        String joueur2 = scanner.nextLine();

        Player p1 = new Player(joueur1, 0);
        Player p2 = new Player(joueur2,1);

        setCurrentPlayer(p1);
    }

    private void initialiseBoard(){
    }

    private void printBoard(){

    }

    private String askMove(){
        Scanner scanner = new Scanner(System.in);
        Player currentPlayer = getCurrentPlayer();
        System.out.println("Piece a deplacer et destination ? ");
        String nextMove = scanner.nextLine();
        // String pieceSelected = nextMove[0];
        // String pieceDestination = nextMove[1];
        return nextMove;
    }

    private boolean isCheckMate(){
        return false;

    }

    private boolean isValidMove(String move){
        String[] splitedMove = move.split(" ");



    }





}
