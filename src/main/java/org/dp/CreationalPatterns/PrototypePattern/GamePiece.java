package org.dp.CreationalPatterns.PrototypePattern;

public class GamePiece implements Prototype<GamePiece>{

    String color;
    int pos;

    public GamePiece(String color, int pos) {
        this.color = color;
        this.pos = pos;
    }

    @Override
    public GamePiece clone() {
        return new GamePiece(this.color, this.pos);
    }
}
