package org.dp.CreationalPatterns.PrototypePattern;

import java.util.*;

public class GameBoard implements Prototype<GameBoard>{

    List<GamePiece> gamePieceList = new ArrayList<>();

    public void addPiece(GamePiece gamePiece){
        gamePieceList.add(gamePiece);
    }

    public void showPieces(){
        gamePieceList.forEach(g -> System.out.println("Color: "+g.color+" and pos: "+g.pos));
    }

    @Override
    public GameBoard clone() {
        GameBoard gameBoard = new GameBoard();
        gamePieceList.forEach(g -> gameBoard.addPiece(g.clone()));
        return gameBoard;
    }
}
