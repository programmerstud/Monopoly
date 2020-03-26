package game;

import player.Player;
import squares.square.Square;
import squares.chance.Chance;
import squares.chance.ChanceType;
import squares.jail.Jail;
import squares.privacy.Privacy;
import squares.start.Start;
import  board.*;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    public int numberOfRounds;
    public ArrayList<Player> players;
    public int numbOfPlayers;
    public Board board;

    public Game() throws Exception
    {
        board = new Board();
        createPlayers();
        play();
    }

    public void createPlayers() throws Exception {
        players = new ArrayList<Player>();
        numbOfPlayers = 2;
        for (int i = 0; i < numbOfPlayers; i++) {
            players.add(new Player("Player " + i));
        }
    }

    public boolean check(int i)
    {
        if (players.get(i).getMoney() < 0)
        {
            players.remove(i);
            return false;
        }
        return true;
    }

    public boolean isItDone()
    {
        if (players.size()  == 1)
            return true;
        return false;
    }

    public void play() {
        while (numberOfRounds <= 6)
        {
            for (int i = 0; i < numbOfPlayers; i++) {
                Player player = players.get(i);
                int currentPosition =  board.movePlayer(player);

                Square square = board.getCurrentPosition(currentPosition);

                System.out.print(player.getName() + " now on square: " + square.getName() + ", " + player.getPosition()  + "\n");

                switch (square.getType()) {
                    case PRIVACY:
                        Property(square, player);
                        break;
                    case CHANCE:
                        if (((Chance) square).getChanceType() == ChanceType.MINUS) {
                            player.setMoney(player.getMoney() - (((Chance)square).getPrice()));
                            System.out.println("Chance: -" + (((Chance)square).getPrice()));
                        } else {
                            player.setMoney(player.getMoney() + (((Chance)square).getPrice()));
                            System.out.println("Chance: +" + (((Chance)square).getPrice()));
                        }
                        break;
                    case JAIL:
                        player.setMoney(player.getMoney() - (((Jail)square).getPrice()));
                        System.out.println("FINE: -" + (((Jail)square).getPrice()));
                        break;
                    case START:
                        player.setMoney(player.getMoney() + (((Start)square).getPrice()));
                        System.out.println("SALARY: +" + (((Start)square).getPrice()));
                        break;
                    case FREEPARKING:
                        break;
                }
                if (check(i))
                    System.out.println("Total amount of money: " + player.getMoney());
                else
                    System.out.println("The game is over for you! You ran out of money!");
                System.out.print("\n");
                if (isItDone())
                {
                    System.out.println("The game is over! The winner is " + players.get(0).getName());
                    return;
                }
            }
            numberOfRounds++;
        }
    }

    public void Property(Square square, Player player)
    {
        int money = player.getMoney();
        if (board.squareOwner(square) != null) {
            if (board.squareOwner(square).getName() != player.getName()) {
                System.out.println("The square is bought by " + board.squareOwner(square).getName() + ".");
                System.out.println("You have to pay.");
                player.setMoney(money - ((Privacy)square).getPrice());
                System.out.println("Fee: -" + ((Privacy)square).getPrice());
            }
            else {
                System.out.println("It is your property!");
                System.out.println("You have to collect the rent.");
                player.setMoney(money  + ((Privacy)square).getPrice());
                System.out.println("Rent: +" + ((Privacy)square).getPrice());
            }
        } else {
            System.out.println("The property is free!");
            if (new Random().nextBoolean()) {
                player.setMoney(money - ((Privacy)square).getPrice());
                System.out.println("Price: -" + ((Privacy)square).getPrice());
                board.buySquare(square, player);
                System.out.println("The property is bought by " + board.squareOwner(square).getName());
            }
            else
                System.out.println("You decided not to buy it!");
        }
    }
}
