package org.example.chessDesignLLD.game;

import org.example.chessDesignLLD.board.Board;
import org.example.chessDesignLLD.board.Move;
import org.example.chessDesignLLD.player.Player;

import java.util.Queue;

public abstract class BoardGame {
    private final Board board;
    private final Queue<Player> players;

    public BoardGame(Board board, Queue<Player> players) {
        this.board = board;
        this.players = players;
    }
    public abstract boolean isOver();
    public void startGame(){
        while(true){
            Player currentPlayer = players.poll();
            Move move = currentPlayer.makeMove();
            board.applyMove(move);
            if(isOver()){
                System.out.println("Game is over.. "+currentPlayer.getName()+" won.");
                break;
            }
            players.add(currentPlayer);
        }
    }
}
