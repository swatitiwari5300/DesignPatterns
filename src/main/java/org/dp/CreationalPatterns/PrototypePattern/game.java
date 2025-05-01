package org.dp.CreationalPatterns.PrototypePattern;

public class game {

    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Blue", 2));
        gameBoard.addPiece(new GamePiece("Green", 3));

        gameBoard.showPieces();

        GameBoard gameBoard1 = gameBoard.clone();

        gameBoard1.showPieces();

    }
}
