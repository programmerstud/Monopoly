package squares.chance;

import squares.square.Square;
import squares.square.Type;

public class Chance extends Square {

    private ChanceType chanceType;

    public Chance(String name, int position, int price, ChanceType type) {
        super(name, position, price, Type.CHANCE);
        setChanceType(type);
    }

    public void setChanceType(ChanceType chanceType) {
        this.chanceType = chanceType;
    }

    public ChanceType getChanceType() {
        return chanceType;
    }

}
