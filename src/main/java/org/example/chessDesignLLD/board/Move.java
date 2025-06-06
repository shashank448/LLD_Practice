package org.example.chessDesignLLD.board;

import org.example.chessDesignLLD.cell.Pair;

public class Move {
    private final Pair source;
    private final Pair destination;

    public Move(Pair source, Pair destination) {
        this.source = source;
        this.destination = destination;
    }

    public Pair getSource() {
        return source;
    }

    public Pair getDestination() {
        return destination;
    }
}
