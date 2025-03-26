package org.example.chessDesignLLD.version1;

public class King implements ChessPiece{
    private final Color color;
    private final PieceName name;
    private boolean isDead;

    public King(Color color, PieceName name, boolean isDead) {
        this.color = color;
        this.name = name;
        this.isDead = isDead;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public void setDead(boolean isDead) {

    }

    @Override
    public PieceName getName() {
        return this.name;
    }
    @Override
    public Color getColor() {
        return this.color;
    }
}
