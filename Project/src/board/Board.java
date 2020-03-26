package board;

import player.Player;

import java.util.*;

import squares.square.Square;

public class Board {
    private Map<Square, Player> playersSquares;
    private ArrayList<Square> allGameSquares;

    public Board() throws Exception {
        allGameSquares = new ArrayList<Square>();
        playersSquares = new HashMap<Square, Player>();
        CreateGameBoard.createBoard(allGameSquares, playersSquares);
    }

    public int movePlayer(Player player) {
        int currentPosition = player.rollTheDice() + player.getPosition();

        if (currentPosition >= allGameSquares.size()) currentPosition -= allGameSquares.size();

        player.setPosition(currentPosition);

        return currentPosition;
    }

    public Square getCurrentPosition(int currentPosition) {
        return allGameSquares.get(currentPosition);
    }

    public Player squareOwner(Square square) {
        return playersSquares.get(square);
    }

    public void buySquare(Square square, Player player)
    {
        playersSquares.put(square, player);
    }
}
