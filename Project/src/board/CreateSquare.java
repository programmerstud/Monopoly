package board;

import squares.square.Square;
import squares.square.Type;
import squares.chance.*;
import squares.privacy.Privacy;
import squares.jail.Jail;
import squares.start.Start;
import squares.freeParking.FreeParking;

import java.util.Random;

public class CreateSquare {
    public static Square createSquare(String name, int cost, int position, Type squareType) throws Exception {
        switch (squareType) {
            case PRIVACY:
                return new Privacy(name, cost, position);
            case START:
                return new Start(name, cost, position);
            case JAIL:
                return new Jail(name, cost, position);
            case CHANCE:
                return new Chance(name, cost, position, new Random().nextBoolean() ? ChanceType.PLUS : ChanceType.MINUS);
            case FREEPARKING:
                return new FreeParking(name, position);
            default:
                throw new Exception();
        }
    }
}
