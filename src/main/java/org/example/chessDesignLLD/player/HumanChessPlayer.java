package org.example.chessDesignLLD.player;

import org.example.chessDesignLLD.board.ChessBoard;
import org.example.chessDesignLLD.board.Move;
import org.example.chessDesignLLD.cell.Pair;
import org.example.chessDesignLLD.piece.ChessPiece;
import org.example.chessDesignLLD.piece.PieceName;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(Map<PieceName, ChessPiece> pieces, ChessBoard chessBoard, String name) {
        super(pieces, chessBoard, name);
    }

    @Override
    public Move makeMove() {
        // Game might start by displaying the chessboard
        getChessBoard().display();
        int x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Optional<ChessPiece> chessPiece = getChessBoard().getCell(new Pair(x, y)).getChessPiece();
        if(!chessPiece.isPresent())
            throw new RuntimeException("Invalid Spot");
        if(!chessPiece.get().equals(getPiece(chessPiece.get().getName())))
            throw  new RuntimeException("Invalid piece - you have selected opponents piece");
        Pair source = new Pair(x, y);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Pair destination = new Pair(x, y);
        // Validation on destination

        return new Move(source, destination);
    }
}
