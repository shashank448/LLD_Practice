package org.example.chessDesignLLD.version1;

import java.util.HashMap;
import java.util.Map;

public abstract class ChessPlayer extends Player{
    private final Map<PieceName, ChessPiece> pieces;
    private final ChessBoard chessBoard;

    public ChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(name);
        this.pieces = pieces;
        this.chessBoard = chessBoard;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public Map<PieceName, ChessPiece> getPieces() {
        return pieces;
    }

    public ChessPiece getPiece(PieceName pieceName){
        if(!pieces.containsKey(pieceName)){
            throw new IllegalArgumentException("Invalid Piece");
        }
        return this.pieces.get(pieceName);
    }
}
