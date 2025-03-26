package org.example.chessDesignLLD.piece;

import org.example.chessDesignLLD.board.ChessBoard;
import org.example.chessDesignLLD.cell.ChessCell;
import org.example.chessDesignLLD.color.Color;

public class Knight implements ChessPiece {
    private final Color color;
    private final PieceName name;
    private boolean isDead;

    public Knight(Color color, PieceName name, boolean isDead) {
        this.color = color;
        this.name = name;
        this.isDead = isDead;
    }

    @Override
    public void move(ChessCell source, ChessCell destination, ChessBoard chessBoard) {
        int x_diff = Math.abs(source.getX()-destination.getX());
        int y_diff = Math.abs(source.getY()-destination.getY());

        // Illegal Move
        if(!(Math.max(x_diff, y_diff)==2 && Math.min(x_diff, y_diff)==1)){
            throw new RuntimeException("Invalid Move");
        }
        if(destination.getChessPiece().isPresent()){
            if(destination.getChessPiece().get().getColor().equals(this.color)){
                throw new RuntimeException("Destination invalid - contains own piece");
            }else{
                destination.getChessPiece().get().setDead(true);
            }
        }
        chessBoard.removePiece(source.getX(), source.getY());
        chessBoard.putPiece(this, destination.getX(), destination.getY());
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
