package org.example.chessDesignLLD.main;

import org.example.chessDesignLLD.board.ChessBoard;
import org.example.chessDesignLLD.color.Color;
import org.example.chessDesignLLD.game.BoardGame;
import org.example.chessDesignLLD.game.Chess;
import org.example.chessDesignLLD.piece.*;
import org.example.chessDesignLLD.player.ChessPlayer;
import org.example.chessDesignLLD.player.HumanChessPlayer;

import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String args[]){
        ChessBoard chessBoard = new ChessBoard();
        ChessPlayer firstPlayer = new HumanChessPlayer(getPieces(Color.WHITE), chessBoard, "Vivek");
        ChessPlayer secondPlayer = new HumanChessPlayer(getPieces(Color.BLACK), chessBoard, "Bharat");
        BoardGame chessBoardGame = new Chess(firstPlayer, secondPlayer, chessBoard);
        chessBoardGame.startGame();

    }
    private static Map<PieceName, ChessPiece> getPieces(Color color){
        Map<PieceName, ChessPiece> pieces = new HashMap<>();
        pieces.put(PieceName.BISHOP1, new Bishop(color, PieceName.BISHOP1, false));
        pieces.put(PieceName.BISHOP2, new Bishop(color, PieceName.BISHOP2, false));
        pieces.put(PieceName.KNIGHT1, new Knight(color, PieceName.KNIGHT1, false));
        pieces.put(PieceName.KNIGHT2, new Knight(color, PieceName.KNIGHT2, false));
        pieces.put(PieceName.ROOK1, new Rook(color, PieceName.ROOK1, false));
        pieces.put(PieceName.ROOK2, new Rook(color, PieceName.ROOK2, false));
        pieces.put(PieceName.KING, new King(color, PieceName.KING, false));
        pieces.put(PieceName.QUEEN, new Queen(color, PieceName.QUEEN, false));
        pieces.put(PieceName.PAWN1, new Pawn(color, PieceName.PAWN1, false));
        pieces.put(PieceName.PAWN2, new Pawn(color, PieceName.PAWN2, false));
        pieces.put(PieceName.PAWN3, new Pawn(color, PieceName.PAWN3, false));
        pieces.put(PieceName.PAWN4, new Pawn(color, PieceName.PAWN4, false));
        pieces.put(PieceName.PAWN5, new Pawn(color, PieceName.PAWN5, false));
        pieces.put(PieceName.PAWN6, new Pawn(color, PieceName.PAWN6, false));
        pieces.put(PieceName.PAWN7, new Pawn(color, PieceName.PAWN7, false));
        pieces.put(PieceName.PAWN8, new Pawn(color, PieceName.PAWN8, false));
        return pieces;
    }
}
