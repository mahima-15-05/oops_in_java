interface ChessPlayer{
    void moves();
}

class Queen implements  ChessPlayer{
    @Override
    public void moves() {
        System.out.println("up, down, left, right , diagonal ( in all 4 directions)");
    }
}
class Rook implements ChessPlayer{

    @Override
    public void moves() {
        System.out.println("up, down, left, right");

    }
}class King implements ChessPlayer{

    @Override
    public void moves() {
        System.out.println("up, down, left, right, diagonal (1 step)");

    }
}

public class MainChessPlayer {
    public static void main(String[] args) {
        Queen queen = new Queen();
        Rook rook = new  Rook();
        rook.moves();
        queen.moves();
    }
}
