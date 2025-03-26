package org.example.chessDesignLLD.piece;

import org.example.chessDesignLLD.board.ChessBoard;
import org.example.chessDesignLLD.cell.ChessCell;
import org.example.chessDesignLLD.color.Color;

public interface ChessPiece {

    void move(ChessCell source, ChessCell destination, ChessBoard chessBoard);

    boolean isDead();

    void setDead(boolean isDead);

    PieceName getName();

    Color getColor();
}
