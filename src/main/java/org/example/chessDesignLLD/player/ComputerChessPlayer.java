package org.example.chessDesignLLD.player;

import org.example.chessDesignLLD.board.ChessBoard;
import org.example.chessDesignLLD.board.Move;
import org.example.chessDesignLLD.piece.ChessPiece;
import org.example.chessDesignLLD.piece.PieceName;

import java.util.Map;

public class ComputerChessPlayer extends ChessPlayer{
    public ComputerChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
