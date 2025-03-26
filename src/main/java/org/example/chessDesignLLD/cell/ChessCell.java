package org.example.chessDesignLLD.cell;

import org.example.chessDesignLLD.piece.ChessPiece;

import java.util.Optional;

public class ChessCell {
    private final int x;
    private final int y;
    private Optional<ChessPiece> chessPiece;

    public ChessCell(int x, int y) {
        this.x = x;
        this.y = y;
        this.chessPiece = Optional.empty();
    }

    public int getY() {
        return y;
    }

    public void setChessPiece(Optional<ChessPiece> chessPiece) {
        this.chessPiece = chessPiece;
    }

    public int getX() {
        return x;
    }

    public Optional<ChessPiece> getChessPiece() {
        return chessPiece;
    }
}
