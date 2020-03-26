package board;

import player.Player;
import squares.square.Square;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import static squares.square.Type.JAIL;
import static squares.square.Type.START;
import static squares.square.Type.FREEPARKING;
import static squares.square.Type.PRIVACY;
import static squares.square.Type.CHANCE;

public class CreateGameBoard {

    public static void AddSquare(Square square, Map<Square, Player> squaresBoughtByPlayer, ArrayList<Square>allGameSquares) throws Exception{
        allGameSquares.add(square);
        squaresBoughtByPlayer.put(square, null);
    }

    public static int randomMoney() {
        Random random = new Random();
        int i = 200 + random.nextInt(400);
        return i;
    }

    public static void createBoard(ArrayList<Square> allGameSquares, Map<Square, Player> playerSquares) throws Exception
    {
        Square gameSquareStart = CreateSquare.createSquare("GO", randomMoney(), 1, START);
        AddSquare(gameSquareStart, playerSquares, allGameSquares);
        Square gameSquare1 = CreateSquare.createSquare("Mediterranean Avenue", randomMoney(), 2, PRIVACY);
        AddSquare(gameSquare1, playerSquares, allGameSquares);
        Square gameSquare2 = CreateSquare.createSquare("Chance", randomMoney(), 3, CHANCE);
        AddSquare(gameSquare2, playerSquares, allGameSquares);
        Square gameSquare3 = CreateSquare.createSquare("Baltic Avenue", randomMoney(), 4, PRIVACY);
        AddSquare(gameSquare3, playerSquares, allGameSquares);
        Square gameSquare4 = CreateSquare.createSquare("Chance", randomMoney(), 5, CHANCE);
        AddSquare(gameSquare4, playerSquares, allGameSquares);
        Square gameSquare5 = CreateSquare.createSquare("Reading Railroad", randomMoney(), 6, PRIVACY);
        AddSquare(gameSquare5, playerSquares, allGameSquares);
        Square gameSquare6 = CreateSquare.createSquare("Oriental Avenue", randomMoney(), 7, PRIVACY);
        AddSquare(gameSquare6, playerSquares, allGameSquares);
        Square gameSquare7 = CreateSquare.createSquare("Vermont Avenue", randomMoney(), 8, PRIVACY);
        AddSquare(gameSquare7, playerSquares, allGameSquares);
        Square gameSquare8 = CreateSquare.createSquare("Connecticut Avenue", randomMoney(), 9, PRIVACY);
        AddSquare(gameSquare8, playerSquares, allGameSquares);
        Square gameSquare9 = CreateSquare.createSquare("JAIL", randomMoney(), 10, JAIL);
        AddSquare(gameSquare9, playerSquares, allGameSquares);
        Square gameSquare10 = CreateSquare.createSquare("St. Charles Place", randomMoney(), 11, PRIVACY);
        AddSquare(gameSquare10, playerSquares, allGameSquares);
        Square gameSquare11 = CreateSquare.createSquare("Electric Company", randomMoney(), 12, PRIVACY);
        AddSquare(gameSquare11, playerSquares, allGameSquares);
        Square gameSquare12 = CreateSquare.createSquare("Chance", randomMoney(), 13, CHANCE);
        AddSquare(gameSquare12, playerSquares, allGameSquares);
        Square gameSquare13 = CreateSquare.createSquare("States Avenue", randomMoney(), 14, PRIVACY);
        AddSquare(gameSquare13, playerSquares, allGameSquares);
        Square gameSquare14 = CreateSquare.createSquare("Virginia Avenue", randomMoney(), 15, PRIVACY);
        AddSquare(gameSquare14, playerSquares, allGameSquares);
        Square gameSquare15 = CreateSquare.createSquare("Pennsylvania Railroad", randomMoney(), 16, PRIVACY);
        AddSquare(gameSquare15, playerSquares, allGameSquares);
        Square gameSquare16 = CreateSquare.createSquare("St. James Place", randomMoney(), 17, PRIVACY);
        AddSquare(gameSquare16, playerSquares, allGameSquares);
        Square gameSquare17 = CreateSquare.createSquare("Chance", randomMoney(), 18, CHANCE);
        AddSquare(gameSquare17, playerSquares, allGameSquares);
        Square gameSquare18 = CreateSquare.createSquare("Free Parking", randomMoney(), 19, FREEPARKING);
        AddSquare(gameSquare18, playerSquares, allGameSquares);
    }
}
